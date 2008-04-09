/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.net.URI;

/**
 * The (abstract) base class of all literal terms such as strings, numbers,
 * boolean truth values (for those domains which need it) and less common terms
 * such as XML documents, images, etc.
 * 
 * Literal terms include a reference to a delegate object which computes
 * literal truth similarity and inheritance of two literals. This may be used
 * to provide a bridge between an axiomatic world and NARS, or to provide a
 * means of adding physical world measures of similarity. An example of this
 * would be a similarity measure on images which computes a metric such as
 * the vector space distance between their eigenvectors relative to a base
 * (potentially useful in image recognition applications) or one which computes
 * the Hamming distance between two strings. The default delegate for each
 * literal in this library should return %1;1% if the terms are equal and %0;1%
 * otherwise. The use of this delegate for inheritance allows the use of things
 * like tree containment in XML as a measure of inheritance.
 * @author jgeldart
 *
 */
public abstract class LiteralTerm extends AtomicTerm {
  
  private LiteralTruthDelegate literalTruthDelegate;
  private URI type;
  
  /**
   * Return the literal truth delegate of the literal term.
   * @return The literal truth delegate.
   */
  public LiteralTruthDelegate getLiteralTruthDelegate() {
    return this.literalTruthDelegate;
  }
  
  public void setLiteralTruthDelegate(LiteralTruthDelegate delegate) {
    this.literalTruthDelegate = delegate;
  }
  
  public TruthValue getSimilarity(LiteralTerm t) {
    return this.literalTruthDelegate.getSimilarity(this, t);
  }
  
  public TruthValue getInheritance(LiteralTerm t) {
    return this.literalTruthDelegate.getInheritance(this, t);
  }

}
