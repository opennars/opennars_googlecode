/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class SequentialConjunction extends CompoundTerm {

  public interface SequentialConjunctionVisitor<R,A> extends Visitor<R,A> {
    public R visit(SequentialConjunction p, A arg);
  }
  
  public<R,A> R accept(SequentialConjunctionVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * @param cs
   */
  public SequentialConjunction(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public SequentialConjunction(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public SequentialConjunction(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }
  
}
