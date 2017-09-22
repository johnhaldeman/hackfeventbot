package org.hackf.discordeventbot;

import java.util.Vector;

import org.hackf.discordeventbot.heql.HEQLBaseListener;
import org.hackf.discordeventbot.heql.HEQLParser;
import org.hackf.discordeventbot.heql.HEQLParser.CondComparisonContext;
import org.hackf.discordeventbot.heql.HEQLParser.CondFieldContext;
import org.hackf.discordeventbot.heql.HEQLParser.CondParenContext;
import org.hackf.discordeventbot.heql.HEQLParser.FieldListContext;
import org.hackf.discordeventbot.heql.HEQLParser.FormatContext;
import org.hackf.discordeventbot.heql.HEQLParser.LiteralContext;
import org.hackf.discordeventbot.heql.HEQLParser.LogicalAndContext;
import org.hackf.discordeventbot.heql.HEQLParser.LogicalOrContext;
import org.hackf.discordeventbot.heql.HEQLParser.OperatorContext;
import org.hackf.discordeventbot.heql.HEQLParser.SelFieldContext;
import org.hackf.discordeventbot.heql.HEQLParser.SelectBaseContext;
import org.hackf.discordeventbot.heql.HEQLParser.SelectDistinctContext;
import org.hackf.discordeventbot.heql.HEQLParser.SelectNextContext;

public class HEQLBotListener extends HEQLBaseListener{

	public static final int TYPE_BASE_SELECT = 0;
	public static final int TYPE_SELECT_DISTINCT = 1;
	public static final int TYPE_SELECT_NEXT = 2;
	private int type = TYPE_BASE_SELECT;
	
	private HEQLCondition conditionTreeRoot = new HEQLCondition();
	private HEQLCondition currentConditionParent;
	private HEQLCondition currentCondition;
	
	private Vector<String> fieldList = new Vector<String>();
	private String format;
	
	public HEQLBotListener(){
		currentConditionParent = conditionTreeRoot;
		format = "";
	}
	
	public int getType() {
		return type;
	}

	@Override
	public void enterSelectDistinct(SelectDistinctContext ctx) {
		super.enterSelectDistinct(ctx);
		
		type = TYPE_SELECT_DISTINCT;
	}
	
	@Override
	public void enterSelectNext(SelectNextContext ctx) {
		super.enterSelectNext(ctx);
		
		type = TYPE_SELECT_NEXT;
	}
	
	@Override
	public void enterSelectBase(SelectBaseContext ctx) {
		super.enterSelectBase(ctx);
		
		type = TYPE_BASE_SELECT;
	}
	
	@Override
	public void enterFormat(FormatContext ctx){
		super.enterFormat(ctx);
		
		format = ctx.getStart().getText();
	}
	
	
	@Override
	public void enterCondComparison(CondComparisonContext ctx) {
		super.enterCondComparison(ctx);	
		
		currentCondition = new HEQLCondition();
		currentConditionParent.addChild(currentCondition);
	}
	
	@Override
	public void enterCondParen(CondParenContext ctx) {
		super.enterCondParen(ctx);
		
		
		HEQLCondition newParent = new HEQLCondition();
		currentConditionParent.addChild(newParent);
		currentConditionParent = newParent;
	}
	
	@Override
	public void exitCondParen(CondParenContext ctx) {
		super.exitCondParen(ctx);

		currentConditionParent = currentConditionParent.getParent();
	}
	
	@Override
	public void enterLogicalAnd(LogicalAndContext ctx) {
		super.enterLogicalAnd(ctx);

		currentCondition.setType(HEQLCondition.TYPE_AND);
	}
	
	@Override
	public void enterLogicalOr(LogicalOrContext ctx) {
		super.enterLogicalOr(ctx);

		currentCondition.setType(HEQLCondition.TYPE_OR);
	}
	
	@Override
	public void enterFieldList(FieldListContext ctx) {
		super.enterFieldList(ctx);
	}

	@Override
	public void enterCondField(CondFieldContext ctx) {
		super.enterCondField(ctx);
		
		String fieldText = ctx.getStart().getText();
		currentCondition.setField(fieldText);		
	}
	
	@Override
	public void enterSelField(SelFieldContext ctx) {
		super.enterSelField(ctx);
		String fieldText = ctx.getStart().getText();
		fieldList.add(fieldText);
	}	


	@Override
	public void enterLiteral(LiteralContext ctx) {
		super.enterLiteral(ctx);
		
		currentCondition.setLiteral(ctx.getStart().getText());
	}

	@Override
	public void enterOperator(OperatorContext ctx) {
		super.enterOperator(ctx);		
		String opText = ctx.getStart().getText().toUpperCase();
		
		if(opText.equals("LIKE"))
			currentCondition.setOperator(HEQLCondition.OP_LIKE);
		else if(opText.equals("="))
			currentCondition.setOperator(HEQLCondition.OP_EQUALS);
	}

	
	public HEQLCondition getConditionTreeRoot() {
		return conditionTreeRoot;
	}

	public void setConditionTreeRoot(HEQLCondition condition) {
		conditionTreeRoot = condition;
	}

	public Vector<String> getFieldList() {
		return fieldList;
	}

	public void setFieldList(Vector<String> fieldList) {
		this.fieldList = fieldList;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public String getFormat(){
		return format;
	}
	
}
