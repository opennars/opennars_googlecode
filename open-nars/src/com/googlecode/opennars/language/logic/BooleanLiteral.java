/**
 * 
 */
package com.googlecode.opennars.language.logic;

/**
 * A boolean literal term, for those domains which require it.
 * 
 * @author jgeldart
 *
 */
public class BooleanLiteral extends LiteralTerm {

  private boolean booleanTerm;
  
  /**
   * <p>
   * A visitor for boolean literals.
   * </p>
   * @author jgeldart
   *
   * @param <R> The visitor return type.
   * @param <A> The visitor argument structure type.
   */
  public interface BooleanLiteralVisitor<R,A> extends Visitor<R,A> {
    
    /**
     * <p>
     * Implement this method to provide the core of the visitor's algorithm.
     * </p>
     * @param p The literal being visited.
     * @param arg The argument structure being threaded through.
     * @return An object of type R.
     */
    public R visit(BooleanLiteral p, A arg);
    
  }
  
  /**
   * <p>
   * Accept a visitor and invoke it on this literal.
   * </p>
   * @param <R> The return type of the visitor.
   * @param <A> The argument structure type of the visitor.
   * @param visitor The visitor being called.
   * @param arg The argument structure being threaded through.
   * @return An object of type R.
   */
  public<R,A> R accept(BooleanLiteralVisitor<R,A> visitor, A arg) {
    return visitor.visit(this, arg);
  }
  
  /**
   * <p>
   * Create a new boolean literal.
   * </p>
   * @param b The boolean to use.
   */
  public BooleanLiteral(boolean b) {
    this.booleanTerm = b;
    this.setLiteralTruthDelegate(new IdentityTruthDelegate());
  }
  
  /**
   * <p>
   * Create a new boolean literal with the given literal truth delegate.
   * </p>
   * @param b The boolean to use.
   * @param delegate The delegate.
   */
  public BooleanLiteral(boolean b, LiteralTruthDelegate delegate) {
    this.booleanTerm = b;
    this.setLiteralTruthDelegate(delegate);
  }

  /**
   * <p>
   * Get the value of this literal as a boolean.
   * </p>
   * @return The boolean term.
   */
  public boolean getBooleanTerm() {
    return booleanTerm;
  }
  
}
