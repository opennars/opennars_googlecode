/**
 * 
 */
package com.googlecode.opennars.areas.serialisation;

import com.googlecode.opennars.language.control.ControlAction;
import com.googlecode.opennars.language.control.LogicAction;
import com.jpmorrsn.javaFBP.InputPort;
import com.jpmorrsn.javaFBP.OutputPort;
import com.jpmorrsn.javaFBP.Packet;

/**
 * <p>
 * Provides a simple abstraction on an <code>AbstractFormatter</code>.
 * Rather than worry about the details of the execution loop, one can just
 * write a <code>format</code> method. This method should take an 
 * <code>Action</code> and return a <code>String</code>.
 * </p>
 * <p>
 * This abstract class probably isn't as useful as the
 * <code>AbstractParser</code> as formatting can be more involved. The use
 * of other components here to collate and reorder the stream may help.
 * </p>
 * @author jgeldart
 *
 */
public abstract class AbstractSimpleFormatter extends AbstractFormatter {
  
  OutputPort stringPort;
  InputPort controlPort;
  InputPort logicPort;

  /* (non-Javadoc)
   * @see com.jpmorrsn.javaFBP.Component#execute()
   */
  @Override
  protected void execute() throws Throwable {
    Packet c = null;
    Packet l = null;
    
    while((c = controlPort.receive()) != null || (l = logicPort.receive()) != null) {
      String out = null;
      if(c != null) {
        out = this.format((ControlAction) c.getContent());
        if(out != null)
          stringPort.send(this.create(out));
        out = null;
        drop(c);
      }
      if(l != null) {
        out = this.format((LogicAction) l.getContent());
        if(out != null)
          stringPort.send(this.create(out));
        drop(l);
      }
    }
  }

  /**
   * <p>
   * Formats a <code>LogicAction</code> to a string. A concrete sub-class of
   * this class would override this in order to provide a renderer for single
   * sentences of the logic.
   * </p>
   * @param content The <code>LogicAction</code> to format into a string
   * @return The rendered string
   */
  protected abstract String format(LogicAction content); 

  /**
   * <p>
   * Formats a <code>ControlAction</code> to a string. A concrete sub-class of
   * this class would override this in order to provide a renderer for single
   * commands to the control strategy.
   * </p>
   * @param content The <code>ControlAction</code> to format into a string
   * @return The rendered string
   */
  protected abstract String format(ControlAction content); 

  /* (non-Javadoc)
   * @see com.jpmorrsn.javaFBP.Component#introspect()
   */
  @Override
  protected Object[] introspect() {
    return new Object[] {
      "Takes two streams of actions and converts them into strings",
      "STRING", "string", String.class, "A formatted string",
      "LOGIC", "logic", LogicAction.class, "A sequence of logical actions",
      "CONTROL", "control", ControlAction.class, "A sequence of control actions"
    };
  }

  /* (non-Javadoc)
   * @see com.jpmorrsn.javaFBP.Component#openPorts()
   */
  @Override
  protected void openPorts() {
    stringPort = openOutput("STRING");
    controlPort = openInput("CONTROL");
    logicPort = openInput("LOGIC");
  }

}
