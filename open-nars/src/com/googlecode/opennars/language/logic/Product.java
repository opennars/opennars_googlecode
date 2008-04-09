/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public class Product extends CompoundTerm {

  public interface ProductVisitor<R,A> extends Visitor<R,A> {
    public R visit(Product p, A arg);
  }
  
  public<R,A> R accept(ProductVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  /**
   * @param cs
   */
  public Product(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public Product(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public Product(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }
  
}
