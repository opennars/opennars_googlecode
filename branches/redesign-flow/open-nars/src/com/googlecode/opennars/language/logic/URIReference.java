/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.net.URI;

/**
 * @author jgeldart
 *
 */
public class URIReference extends AtomicTerm {
  
  private URI uri;
  
  public interface URIReferenceVisitor<R,A> extends Visitor<R,A> {
    public R visit(URIReference p, A arg);
  }
  
  public<R,A> R accept(URIReferenceVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

  public URI getURI() {
    return this.uri;
  }
  
}
