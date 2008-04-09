/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class IntDifference extends CompoundTerm {

  public interface IntDifferenceVisitor<R,A> extends Visitor<R,A> {
    public R visit(IntDifference p, A arg);
  }
  
  public<R,A> R accept(IntDifferenceVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * @param cs
   */
  public IntDifference(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public IntDifference(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public IntDifference(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }
  
}
