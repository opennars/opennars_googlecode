/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class ExtImage extends CompoundTerm {
  
  public interface ExtImageVisitor<R,A> extends Visitor<R,A> {
    public R visit(ExtImage p, A arg);
  }
  
  public<R,A> R accept(ExtImageVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * @param cs
   */
  public ExtImage(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public ExtImage(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public ExtImage(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }

}
