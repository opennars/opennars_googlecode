/**
 * 
 */
package com.googlecode.opennars.language.control;

import com.googlecode.opennars.language.Action;

/**
 * <p>
 * An <code>Action</code> representing some extra-logical event or data
 * being passed between <code>Area</code>s in an OpenNARS system. Examples
 * of such data include instructions to change the parameters of a reasoner,
 * requests for an external operation to be performed, etc. This interface
 * has no additional members currently, but this is expected to change as
 * we learn more about the sorts of control actions developers need.
 * </p>
 * 
 * @author jgeldart
 *
 */
public interface ControlAction extends Action {

}
