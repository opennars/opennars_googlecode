/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class Negation extends CompoundTerm {
  
  public interface NegationVisitor<R,A> extends Visitor<R,A> {
    public R visit(Negation p, A arg);
  }
  
  public<R,A> R accept(NegationVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * @param cs
   */
  public Negation(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public Negation(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public Negation(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }
  
}
