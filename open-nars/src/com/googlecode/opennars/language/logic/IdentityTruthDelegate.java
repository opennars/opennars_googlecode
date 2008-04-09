/**
 * 
 */
package com.googlecode.opennars.language.logic;

/**
 * Treats object equality (in the Java sense) as the defining condition of
 * similarity.
 * 
 * @author jgeldart
 *
 */
public class IdentityTruthDelegate implements LiteralTruthDelegate {

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.LiteralTruthDelegate#getInheritance(com.googlecode.opennars.language.logic.LiteralTerm, com.googlecode.opennars.language.logic.LiteralTerm)
   */
  public TruthValue getInheritance(LiteralTerm t1, LiteralTerm t2) {
    if(t1.equals(t2))
      return new TruthValue(1,1);
    else
      return new TruthValue(0,1);
  }

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.LiteralTruthDelegate#getSimilarity(com.googlecode.opennars.language.logic.LiteralTerm, com.googlecode.opennars.language.logic.LiteralTerm)
   */
  public TruthValue getSimilarity(LiteralTerm t1, LiteralTerm t2) {
    return this.getInheritance(t1, t2);
  }

}
