/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class ParallelConjunction extends CompoundTerm {

  public interface ParallelConjunctionVisitor<R,A> extends Visitor<R,A> {
    public R visit(ParallelConjunction p, A arg);
  }
  
  public<R,A> R accept(ParallelConjunctionVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * @param cs
   */
  public ParallelConjunction(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public ParallelConjunction(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public ParallelConjunction(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }
  
}
