/**
 * 
 */
package com.googlecode.opennars.language;

import com.googlecode.opennars.language.logic.Term;

/**
 * <p>
 * A <code>Nameable</code> object is one which can be asked for a name which
 * may be used in the reasoner. A name is some term.
 * </p>
 * @author jgeldart
 *
 */
public interface Namable {
  
  /**
   * Fetch the name of the object.
   * @return The object's name.
   */
  public Term getName();

}
