/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.List;

/**
 * @author jgeldart
 *
 */
public abstract class Statement extends CompoundTerm {

  /**
   * @param cs
   */
  public Statement(List<Term> cs) {
    super(cs);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t1
   * @param t2
   */
  public Statement(Term t1, Term t2) {
    super(t1, t2);
    // TODO Auto-generated constructor stub
  }

  /**
   * @param t
   */
  public Statement(Term t) {
    super(t);
    // TODO Auto-generated constructor stub
  }

}
