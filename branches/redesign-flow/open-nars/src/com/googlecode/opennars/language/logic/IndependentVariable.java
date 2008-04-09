/**
 * 
 */
package com.googlecode.opennars.language.logic;

/**
 * An independent variable, used in NAL-5 and up for higher-order reasoning.
 * 
 * @author jgeldart
 *
 */
public class IndependentVariable extends Variable {

  public interface IndependentVariableVisitor<R,A> extends Visitor<R,A> {
    public R visit(IndependentVariable p, A arg);
  }
  
  public<R,A> R accept(IndependentVariableVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }
  
}
