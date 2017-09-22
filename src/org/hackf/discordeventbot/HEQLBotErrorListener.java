package org.hackf.discordeventbot;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class HEQLBotErrorListener extends BaseErrorListener{
	
	String errorMessage = "";

	@Override
	public void syntaxError(Recognizer<?,?> recognizer,
            Object offendingSymbol,
            int line,
            int charPositionInLine,
            String msg,
            RecognitionException e){
		errorMessage = "Syntax Error: Line " + line + " Character " + charPositionInLine + "\n";
		errorMessage += msg;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	
}
