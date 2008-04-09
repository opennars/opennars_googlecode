/**
 * 
 */
package com.googlecode.opennars.language.logic;

/**
 * A dependent variable, used in NAL-5 and up for higher-order reasoning.
 * @author jgeldart
 *
 */
public class DependentVariable extends Variable {

  public interface DependentVariableVisitor<R,A> extends Visitor<R,A> {
    public R visit(DependentVariable p, A arg);
  }
  
  public<R,A> R accept(DependentVariableVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }
  
}
