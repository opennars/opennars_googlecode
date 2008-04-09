/**
 * 
 */
package com.googlecode.opennars.language.control;

import com.googlecode.opennars.language.Action;

/**
 * <p>
 * A <code>LogicAction</code> represents some logical information being sent
 * between <code>Area</code>s in OpenNARS. Implementations of this interface
 * are things such as goals, questions and judgements.
 * </p>
 * <p>
 * In order to better support compositional inferencing and other catamorphic
 * operations, this interface includes an inner interface for the visitor
 * pattern.
 * </p>
 * @author jgeldart
 *
 */
public interface LogicAction extends Action {
  
  /**
   * <p>
   * An interface used in the visitor pattern over <code>LogicAction</code>s.
   * </p>
   * @author jgeldart
   *
   * @param <R> The result type from the visit operation.
   * @param <A> The type of the argument passed through the visiting.
   */
  public interface Visitor<R,A> {
    
    /**
     * <p>
     * Visit a <code>LogicAction</code> with the given argument object
     * and return a result. The argument object is typically used to
     * wire through some necessary state to all the visit operations performed.
     * </p>
     * @param <R> The type of the result.
     * @param <A> The type of the argument object.
     * @param act The <code>LogicAction</code> being visited.
     * @param argument The argument object being used in the visiting.
     * @return Some result of type R.
     */
    public R visit(LogicAction act, A argument);
    
  }
  
  /**
   * <p>
   * The other half of the visitor design pattern consists of
   * <code>LogicAction</code>s accepting a visitor upon themselves.
   * The visitor is executed and a result is returned.
   * </p>
   * @param <R> The result type.
   * @param <A> The argument type.
   * @param visitor The visitor to be used.
   * @param argument The argument structure used for wiring state.
   * @return Some result of type R.
   */
  public <R,A> R accept(Visitor<R,A> visitor, A argument); 

}
