package ro.tirzuman.iulian.fmse.bonust1;

import java.util.*;

import com.microsoft.z3.*;

public class Z3Api {

	public static String SAT = "satisfiable";
	public static String NOT_SAT = "not satisfiable";
	public static String NOT_KNOWN = "not known";

	@SuppressWarnings("serial")
	class TestFailedException extends Exception {
		public TestFailedException() {
			super("Check FAILED");
		}
	};

	private Context ctx;

	public Z3Api() {
		try {
			com.microsoft.z3.Global.ToggleWarningMessages(true);
			Log.open("test.log");

			System.out.print("Z3 Major Version: ");
			System.out.println(Version.getMajor());
			System.out.print("Z3 Full Version: ");
			System.out.println(Version.getString());
			System.out.print("Z3 Full Version String: ");
			System.out.println(Version.getFullVersion());

			// These examples need model generation turned on.
			HashMap<String, String> cfg = new HashMap<String, String>();
			cfg.put("model", "true");
			ctx = new Context(cfg);

			Log.close();
			if (Log.isOpen())
				System.out.println("Log is still open!");
		} catch (Z3Exception ex) {
			System.out.println("Z3 Managed Exception: " + ex.getMessage());
			System.out.println("Stack trace: ");
			ex.printStackTrace(System.out);
		} catch (Exception ex) {
			System.out.println("Unknown Exception: " + ex.getMessage());
			System.out.println("Stack trace: ");
			ex.printStackTrace(System.out);
		}
	}

	public String checkSatisfiability(String assertion) {
		Symbol[] declNames = { ctx.mkSymbol("a"), ctx.mkSymbol("b") };
		FuncDecl a = ctx.mkConstDecl(declNames[0], ctx.mkIntSort());
		FuncDecl b = ctx.mkConstDecl(declNames[1], ctx.mkIntSort());
		FuncDecl[] decls = new FuncDecl[] { a, b };

		BoolExpr f = ctx.parseSMTLIB2String("(assert (" + assertion  + "))", null, null, declNames, decls);
		System.out.println("formula: " + f);

		Solver s = ctx.mkSolver();
		s.add(f);
		Status result = s.check();
		if (Status.SATISFIABLE.equals(result)) {
			return SAT;
		} else if (Status.UNSATISFIABLE.equals(result)) {
			return NOT_SAT;
		} else {
			return NOT_KNOWN;
		}
	}

	public static void main(String[] args) {
		Z3Api z3Api = new Z3Api();
		z3Api.checkSatisfiability(args[0]);
	}
}