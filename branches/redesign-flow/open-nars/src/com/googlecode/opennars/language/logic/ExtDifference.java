/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class ExtDifference extends CompoundTerm {

  public interface ExtDifferenceVisitor<R,A> extends Visitor<R,A> {
    public R visit(ExtDifference p, A arg);
  }
  
  public<R,A> R accept(ExtDifferenceVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * @param cs
   */
  public ExtDifference(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public ExtDifference(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public ExtDifference(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }
  
}
