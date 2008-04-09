/**
 * 
 */
package com.googlecode.opennars.language.logic;

/**
 * A variable term in the system; either a query variable or a logical
 * variable.
 * @author jgeldart
 *
 */
public abstract class Variable extends AtomicTerm {

  private String variableName;

  /**
   * Get the name of this variable.
   * @return The variable name
   */
  public String getVariableName() {
    return variableName;
  }
  
}
