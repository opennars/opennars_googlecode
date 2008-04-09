/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class FutureTense extends CompoundTerm {

  public interface FutureTenseVisitor<R,A> extends Visitor<R,A> {
    public R visit(FutureTense p, A arg);
  }
  
  public<R,A> R accept(FutureTenseVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * @param cs
   */
  public FutureTense(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public FutureTense(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public FutureTense(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }
  
}
