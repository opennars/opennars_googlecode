/**
 * 
 */
package com.googlecode.opennars.areas.serialisation;

import com.googlecode.opennars.areas.AbstractArea;
import com.jpmorrsn.javaFBP.InPorts;
import com.jpmorrsn.javaFBP.InPort;
import com.jpmorrsn.javaFBP.OutPort;

/**
 * <p>
 * A formatter is an area which takes in a set of control and logic actions and
 * converts them into a string which may be saved to a file, printed, etc.
 * Specific serialisation formats implement a concrete sub-class of this.
 * </p>
 * <p>
 * Note, while some serialisations may require it, there is no general
 * requirement for a pair of an <code>AbstractParser</code> and an
 * <code>AbstractFormatter</code> connected in series to be the identity
 * on strings. Serialisations which do not have this isomorphism property
 * should document their implementations appropriately.
 * </p>
 * 
 * @author jgeldart
 *
 */
@InPorts(value= {@InPort("CONTROL"), @InPort("LOGIC")})
@OutPort("STRING")
public abstract class AbstractFormatter extends AbstractArea {

}
