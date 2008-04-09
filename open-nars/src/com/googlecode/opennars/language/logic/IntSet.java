/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class IntSet extends CompoundTerm {
  
  public interface IntSetVisitor<R,A> extends Visitor<R,A> {
    public R visit(IntSet p, A arg);
  }
  
  public<R,A> R accept(IntSetVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * @param cs
   */
  public IntSet(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public IntSet(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public IntSet(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }

}
