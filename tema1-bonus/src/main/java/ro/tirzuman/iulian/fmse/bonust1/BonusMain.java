package ro.tirzuman.iulian.fmse.bonust1;

import java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import ro.tirzuman.iulian.fmse.bonust1.antlr.BonusLexer;
import ro.tirzuman.iulian.fmse.bonust1.antlr.BonusParser;

public class BonusMain {

	public static void main(String... args) throws Exception {
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(new File(args[0])));
		BonusLexer lexer = new BonusLexer(input);
		TokenStream tokens = new CommonTokenStream(lexer);
		BonusParser parser = new BonusParser(tokens);

		TreeBuilder treeBuilder = new TreeBuilder();
		parser.addParseListener(treeBuilder);

		String z3String = treeBuilder.getZ3String();
		Z3Api z3Api = new Z3Api();
		System.out.println(z3Api.checkSatisfiability(z3String));
	}

}
