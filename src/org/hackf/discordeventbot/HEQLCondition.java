package org.hackf.discordeventbot;

import java.util.Vector;

import com.google.gson.Gson;

// A condition for HEQL that also acts as a Tree-Node
public class HEQLCondition {
	
	public static final int TYPE_OR = 1;
	public static final int TYPE_AND = 2;
	
	public static final int OP_LIKE = 1;
	public static final int OP_EQUALS = 2;
	
	private Vector<HEQLCondition> children;
	private HEQLCondition parent;
	
	private String literal;
	private String field;
	private int operator;
	private int type = 0;
	
	public HEQLCondition(){
		children = new Vector<HEQLCondition>();
	}
	
	public void setParent(HEQLCondition parent){
		this.parent = parent;
	}
	
	public HEQLCondition getParent(){
		return parent;
	}
	
	public void addChild(HEQLCondition cond){
		cond.setParent(this);
		children.add(cond);
	}	
	
	public String conditionsTreeToString(int level){
		StringBuilder bld = new StringBuilder();
		
		for(int i=0; i < level; i++){
			bld.append("-");
		}
		bld.append(" ");
		
		if(children.size() == 0)
			bld.append(field);
		
		if(operator == OP_LIKE){
			bld.append(" LIKE ");
		}
		else if(operator == OP_EQUALS){
			bld.append(" = ");
		}
		
		if(children.size() == 0)
			bld.append(literal);
		
		if(type == TYPE_OR){
			bld.append(" OR ");
		}
		else if(type == TYPE_AND){
			bld.append(" AND ");
		}
				
		bld.append("\n");
		
		for(HEQLCondition child: children){
			bld.append(child.conditionsTreeToString(level + 1));
		}
		
		return bld.toString();
	}
	
	public boolean evaluate(HackforgeEventFromSite event){
		// No value for anything (conditionless) - Evaluate true
		boolean value = true;
		
		// We have no conditions - everything is true
		if(parent == null && children.size() == 0)
			return true;
		
		// We have children - evaluate those children
		if(children.size() > 0){
			// Set type to AND until a child tells us differently
			type = TYPE_AND;
			
			// This strange or tracking and late evaluation is meant to 
			// ensure that OR statements have lower order of operation than
			// AND statements
			Vector<Boolean> ors = new Vector<Boolean>();
			boolean andValue = true;
			//boolean firstAnd = true;
			
			for(HEQLCondition child: children){
				boolean childVal = child.evaluate(event);
				if(type == TYPE_AND){
					andValue = andValue && childVal;	
				}
				else if(type == TYPE_OR){
					ors.add(new Boolean(andValue));
					andValue = childVal;
				}
				// the previous child indicates the operation for the next child
				// If there is no next child, it indicates the operation for the
				// next child of the parent
				type = child.getType();
			}
			ors.add(new Boolean(andValue));
			
			// Evaluate ORs after all ANDs are iterated through and queued
			boolean firstOr = true;
			
			value = ors.get(0);
			for(Boolean or: ors){
				value = value || or;
			}
		}
		// We have a leaf node, just evaluate
		else{
			String compLiteral = literal.substring(1);
			compLiteral = compLiteral.substring(0, compLiteral.length() -1 );
			if(operator == OP_LIKE){
				String matchme = compLiteral.toUpperCase().replace("%", ".*");
				String fieldValue = getValueForField(field, event).toUpperCase();
				value = fieldValue.matches(matchme);
			}
			else if(operator == OP_EQUALS){
				value = getValueForField(field, event).toUpperCase().equals(compLiteral.toUpperCase());
			}
		}
		
		return value;
	}
	
	private String getValueForField(String field, HackforgeEventFromSite event){
		if(field.toUpperCase().equals("GROUP")){
			return event.getGroup();
		}
		else if(field.toUpperCase().equals("CONTENT")){
			return event.getContent();
		}
		else if(field.toUpperCase().equals("TITLE")){
			return event.getTitle();
		}
		else if(field.toUpperCase().equals("EXCERPT")){
			return event.getExcerpt();
		}
		else if(field.toUpperCase().equals("MEETUP_LINK")){
			return event.getExcerpt();
		}
		else if(field.toUpperCase().equals("FACEBOOK_LINK")){
			return event.getExcerpt();
		}
		else{
			return null;
		}
	}
	
	public String getLiteral() {
		return literal;
	}
	public void setLiteral(String literal) {
		this.literal = literal;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getOperator() {
		return operator;
	}
	public void setOperator(int operator) {
		this.operator = operator;
	}
	
	

}
