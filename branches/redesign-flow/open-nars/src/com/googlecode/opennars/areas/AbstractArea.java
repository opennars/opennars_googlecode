/**
 * <p>
 * Top-level package containing classes implementing processing tasks,
 * called <i>areas</i> after the standard way of dividing up the neo-cortex in
 * humans. Areas are implemented as JavaFBP components.
 * </p>
 */
package com.googlecode.opennars.areas;

import com.jpmorrsn.javaFBP.Component;

/**
 * <p>
 * Abstract class which all areas should inherit from. Provides the basic
 * functionality of an OpenNARS processing component. Currently this doesn't
 * actually amount to anything, but it is expected that certain features will
 * be found to be common to most or even all areas, and so this class exists in
 * anticipation.
 * </p>
 *  
 * @author jgeldart
 *
 */
public abstract class AbstractArea extends Component {

}
