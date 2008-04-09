/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class PastTense extends CompoundTerm {

  public interface PastTenseVisitor<R,A> extends Visitor<R,A> {
    public R visit(PastTense p, A arg);
  }
  
  public<R,A> R accept(PastTenseVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * @param cs
   */
  public PastTense(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public PastTense(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public PastTense(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }
  
}
