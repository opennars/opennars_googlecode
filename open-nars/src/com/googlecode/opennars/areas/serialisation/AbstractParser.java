/**
 * 
 */
package com.googlecode.opennars.areas.serialisation;

import com.googlecode.opennars.areas.AbstractArea;
import com.jpmorrsn.javaFBP.InPort;
import com.jpmorrsn.javaFBP.OutPort;
import com.jpmorrsn.javaFBP.OutPorts;

/**
 * <p>
 * An <code>AbstractParser</code> is a component which takes some string and
 * converts it into a series of NARS language actions. These terms may be 
 * either control or logic actions, and each is output on a separate port.
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
@InPort("STRING")
@OutPorts(value = { @OutPort("LOGIC"), @OutPort("CONTROL") })
public abstract class AbstractParser extends AbstractArea {

}
