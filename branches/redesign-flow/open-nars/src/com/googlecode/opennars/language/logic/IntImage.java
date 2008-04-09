/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class IntImage extends CompoundTerm {
  
  public interface IntImageVisitor<R,A> extends Visitor<R,A> {
    public R visit(IntImage p, A arg);
  }
  
  public<R,A> R accept(IntImageVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * @param cs
   */
  public IntImage(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public IntImage(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public IntImage(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }

}
