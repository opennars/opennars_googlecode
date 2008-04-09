/**
 * 
 */
package com.googlecode.opennars.language.logic;

/**
 * <p>
 * This class is the (abstract) base class of all fully logical language items.
 * </p>
 * @author jgeldart
 *
 */
public abstract class Term {

  /**
   * <p>
   * A visitor on <code>Term</code>s.
   * </p> 
   * @author jgeldart
   *
   * @param <R> The return type of the visitor.
   * @param <A> The type of the argument object for the visitor.
   */
  public interface Visitor<R,A> {
    
    /**
     * <p>
     * Visit a given term with the current visitor object.
     * </p>
     * @param act The term to visit.
     * @param arg The argument object passed through the visitor.
     * @return A result of type R.
     */
    public R visit(Term act, A arg);
    
  }
  
  /** 
   * <p>
   * Accept a visitor on this term and invoke it.
   * </p>
   * @param visitor The visitor to invoke. 
   * @param argument The argument structure being threaded through.
   * @param <R> The return type of the visitor.
   * @param <A> The argument structure type of the visitor.
   * @return A result of type R.
   * @see com.googlecode.opennars.language.logic.LogicAction#accept(com.googlecode.opennars.language.logic.LogicAction.Visitor, java.lang.Object)
   */
  public <R, A> R accept(Visitor<R, A> visitor, A argument) {
    return visitor.visit(this, argument);
  }
  
}