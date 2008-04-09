/**
 * 
 */
package com.googlecode.opennars.language.logic;

/**
 * Computes the similarity and inheritance truth value of two literal terms.
 * @author jgeldart
 *
 */
public interface LiteralTruthDelegate {

  public TruthValue getSimilarity(LiteralTerm t1, LiteralTerm t2);
  public TruthValue getInheritance(LiteralTerm t1, LiteralTerm t2);
  
}
