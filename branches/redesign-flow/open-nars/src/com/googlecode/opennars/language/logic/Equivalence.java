/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class Equivalence extends Statement {
  
  public interface EquivalenceVisitor<R,A> extends Visitor<R,A> {
    public R visit(Equivalence p, A arg);
  }
  
  public<R,A> R accept(EquivalenceVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * @param cs
   */
  public Equivalence(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public Equivalence(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public Equivalence(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }

}
