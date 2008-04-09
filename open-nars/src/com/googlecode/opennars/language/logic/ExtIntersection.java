/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * <p>
 * Represents an extensional intersection.
 * </p>
 * 
 * @author jgeldart
 * 
 */
public class ExtIntersection extends CompoundTerm {
  
  /**
   * <p>
   * A visitor on extensional intersections.
   * </p>
   * @author jgeldart
   *
   * @param <R> The return type of the visitor.
   * @param <A> The argument structure type of the visitor.
   */
  public interface ExtIntersectionVisitor<R,A> extends Visitor<R,A> {
    
    /**
     * <p>
     * Visits an extensional intersection.
     * </p>
     * @param p The extensional intersection.
     * @param arg The argument structure being threaded through the visitor.
     * @return An object of type R.
     */
    public R visit(ExtIntersection p, A arg);
  }
  
  /**
   * <p>
   * Accepts an <code>ExtIntersectionVisitor</code>
   * </p>
   * @param <R> The return type of the visitor.
   * @param <A> The argument structure type of the visitor.
   * @param visitor The visitor.
   * @param arg The argument structure being threaded through the visitor
   * @return An object of type R.
   */
  public<R,A> R accept(ExtIntersectionVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * <p>
   * Create a new extensional intersection from a list of intersectands.
   * </p>
   * @param cs The intersectands.
   */
  public ExtIntersection(List<Term> cs) {
    super(cs);
  }

  /**
   * <p>
   * Create a new extensional intersection from a pair of intersectand terms.
   * </p>
   * @param t1 The first intersectand.
   * @param t2 The second intersectand.
   */
  public ExtIntersection(Term t1, Term t2) {
    super(t1, t2);
  }

  /**
   * <p>
   * Create a new extensional intersection from a single intersectand term.
   * </p>
   * @param t The intersectand.
   */
  public ExtIntersection(Term t) {
    super(t);
  }

}
