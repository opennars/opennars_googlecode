/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class ExtSet extends CompoundTerm {
  
  public interface ExtSetVisitor<R,A> extends Visitor<R,A> {
    public R visit(ExtSet p, A arg);
  }
  
  public<R,A> R accept(ExtSetVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * @param cs
   */
  public ExtSet(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public ExtSet(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public ExtSet(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }
  
}
