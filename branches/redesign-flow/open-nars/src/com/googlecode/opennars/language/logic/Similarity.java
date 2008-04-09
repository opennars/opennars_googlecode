/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class Similarity extends Statement {

  public interface SimilarityVisitor<R,A> extends Visitor<R,A> {
    public R visit(Similarity p, A arg);
  }
  
  public<R,A> R accept(SimilarityVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * @param cs
   */
  public Similarity(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public Similarity(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public Similarity(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }
}
