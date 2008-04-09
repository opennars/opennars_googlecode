/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class Conjunction extends CompoundTerm {

  /**
   * <p>
   * Construct a conjunction from a list of conjunctions.
   * </p>
   * @param cs The conjuncts to use.
   */
  public Conjunction(List<Term> cs) {
    super(cs);
  }
  
  /**
   * <p>
   * Construct a conjunction of a single term.
   * </p>
   * @param t The conjunct.
   */
  public Conjunction(Term t) {
    super(t);
  }
  
  /**
   * <p>
   * Construct a conjunction of two conjuncts.
   * </p>
   * @param t1 The first conjunct.
   * @param t2 The second conjunct.
   */
  public Conjunction(Term t1, Term t2) {
    super(t1, t2);
  }

  /**
   * <p>
   * A visitor on <code>Conjunction</code>s.
   * </p>
   * @author jgeldart
   *
   * @param <R> The return type of the visitor.
   * @param <A> The argument structure type of the visitor.
   */
  public interface ConjunctionVisitor<R,A> extends Visitor<R,A> {
    /**
     * <p>
     * Visit a <code>Conjunction</code>.
     * @param p The conjunction.
     * @param arg The argument structure being threaded through.
     * @return An object of type R.
     */
    public R visit(Conjunction p, A arg);
  }
  
  /**
   * <p>
   * Accept a visitor and invoke it.
   * </p>
   * @param <R> The return type of the visitor.
   * @param <A> The argument structure type of the visitor.
   * @param visitor The visitor.
   * @param arg The argument structure being threaded through.
   * @return An object of type R.
   */
  public<R,A> R accept(ConjunctionVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }
  
}
