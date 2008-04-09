/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class Disjunction extends CompoundTerm {

  public interface DisjunctionVisitor<R,A> extends Visitor<R,A> {
    public R visit(Disjunction p, A arg);
  }
  
  public<R,A> R accept(DisjunctionVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * @param cs
   */
  public Disjunction(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public Disjunction(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public Disjunction(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }
  
}
