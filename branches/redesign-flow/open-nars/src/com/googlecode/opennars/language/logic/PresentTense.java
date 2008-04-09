/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class PresentTense extends CompoundTerm {

  public interface PresentTenseVisitor<R,A> extends Visitor<R,A> {
    public R visit(PresentTense p, A arg);
  }
  
  public<R,A> R accept(PresentTenseVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * @param cs
   */
  public PresentTense(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public PresentTense(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public PresentTense(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }
  
}
