/**
 * 
 */
package com.googlecode.opennars.language.logic;

/**
 * @author jgeldart
 *
 */
public class NumericLiteral extends LiteralTerm {
  
  private Number num;
  
  public interface NumericLiteralVisitor<R,A> extends Visitor<R,A> {
    public R visit(NumericLiteral p, A arg);
  }
  
  public<R,A> R accept(NumericLiteralVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

}
