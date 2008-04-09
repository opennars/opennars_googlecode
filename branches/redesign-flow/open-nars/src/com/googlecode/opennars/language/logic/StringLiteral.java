/**
 * 
 */
package com.googlecode.opennars.language.logic;

import java.net.URI;

/**
 * @author jgeldart
 *
 */
public class StringLiteral extends LiteralTerm {
  
  private String content;
  private String lang;
  
  public interface StringLiteralVisitor<R,A> extends Visitor<R,A> {
    public R visit(StringLiteral p, A arg);
  }
  
  public<R,A> R accept(StringLiteralVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }

}
