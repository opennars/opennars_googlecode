/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * The (abstract) base class of all compound terms.
 * </p>
 * @author jgeldart
 *
 */
public abstract class CompoundTerm extends Term {
  
  private List<Term> components;
  
  /**
   * <p>
   * Create a new compound term from a list of components.
   * </p>
   * @param cs The list of components.
   */
  public CompoundTerm(List<Term> cs) {
    this.components = cs;
  }
  
  /**
   * <p>
   * Create a new compound term with a single component.
   * </p>
   * @param t The term to use.
   */
  public CompoundTerm(Term t) {
    this.components = new ArrayList<Term>();
    this.components.add(t);
  }
  
  /**
   * <p>
   * Create a new compound term with two components.
   * </p>
   * @param t1 The first component.
   * @param t2 The second component.
   */
  public CompoundTerm(Term t1, Term t2) {
    this.components = new ArrayList<Term>();
    this.components.add(t1);
    this.components.add(t2);
  }
  
  /**
   * <p>
   * Get the components of this compound term.
   * </p>
   * @return The components.
   */
  public List<Term> getComponents() {
    return this.components;
  }
  
}
