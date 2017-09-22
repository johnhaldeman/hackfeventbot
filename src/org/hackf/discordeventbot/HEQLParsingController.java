package org.hackf.discordeventbot;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.hackf.discordeventbot.heql.*;


public class HEQLParsingController {
	HEQLBotErrorListener errorListener;
	HEQLParser parser;
	
	public HEQLBotListener parse(String toParse) throws IOException{
		byte[] arr = toParse.getBytes(StandardCharsets.UTF_8);
		
		InputStream stream = new ByteArrayInputStream(arr);
		
		CharStream input = CharStreams.fromStream(stream, StandardCharsets.UTF_8);
	    
		HEQLLexer lexer = new HEQLLexer(input);
	
		CommonTokenStream tokens = new CommonTokenStream(lexer);
	
		parser = new HEQLParser(tokens);
		
		errorListener = new HEQLBotErrorListener();
		parser.addErrorListener(errorListener);
		
		ParseTree tree = parser.message();  // parse
		ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
		HEQLBotListener proc = new HEQLBotListener();
		walker.walk(proc, tree); // initiate walk of tree with listener

		
		return proc;		
	}
	
	public String getErrorMessage(){
		return errorListener.getErrorMessage();
	}
	
	public boolean hasError(){
		return parser.getNumberOfSyntaxErrors() != 0;
	}
}
