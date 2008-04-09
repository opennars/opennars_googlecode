/**
 * 
 */
package com.googlecode.opennars.language.logic;

/**
 * A query variable, used in <code>Question</code> sentences to indicate a
 * 'hole' to be filled by the reasoner. 
 * @author jgeldart
 *
 */
public class QueryVariable extends Variable {
  
  public interface QueryVariableVisitor<R,A> extends Visitor<R,A> {
    public R visit(QueryVariable p, A arg);
  }
  
  public<R,A> R accept(QueryVariableVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

}
