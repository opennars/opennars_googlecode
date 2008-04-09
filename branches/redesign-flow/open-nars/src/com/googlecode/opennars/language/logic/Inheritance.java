/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class Inheritance extends Statement {

  public interface InheritanceVisitor<R,A> extends Visitor<R,A> {
    public R visit(Inheritance p, A arg);
  }
  
  public<R,A> R accept(InheritanceVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * @param cs
   */
  public Inheritance(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public Inheritance(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public Inheritance(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }
}
