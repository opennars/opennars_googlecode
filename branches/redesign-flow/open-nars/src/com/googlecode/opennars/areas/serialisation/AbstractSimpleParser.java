/**
 * 
 */
package com.googlecode.opennars.areas.serialisation;

import java.util.List;

import com.googlecode.opennars.language.Action;
import com.googlecode.opennars.language.control.ControlAction;
import com.googlecode.opennars.language.control.LogicAction;
import com.jpmorrsn.javaFBP.InputPort;
import com.jpmorrsn.javaFBP.OutputPort;
import com.jpmorrsn.javaFBP.Packet;

/**
 * <p>
 * An <code>AbstractSimpleParser</code> abstracts away some of the complexities
 * of writing a parser area for OpenNARS. Rather than implementing the 
 * <code>execute</code> method, one simply writes a <code>parse</code> method
 * which returns a sequence of <code>Action</code>s.
 * </p>
 * 
 * @author jgeldart
 *
 */
public abstract class AbstractSimpleParser extends AbstractParser {
  
  InputPort stringPort;
  OutputPort controlPort;
  OutputPort logicPort;

  /* (non-Javadoc)
   * @see com.jpmorrsn.javaFBP.Component#execute()
   */
  @Override
  protected void execute() throws Throwable {
    
    Packet p;
    while((p = this.stringPort.receive()) != null) {
      String str = (String) p.getContent();
      
      // Get the results of parsing the string
      List<Action> acts = this.parse(str);
      
      // For each action in the parse results, forward it to the appropriate channel 
      for(Action a : acts) {
        if(a instanceof LogicAction)
          this.logicPort.send(create(a));
        else if(a instanceof ControlAction)
          this.controlPort.send(create(a));
      }
      drop(p);
    }
    
    this.stringPort.close();

  }

  /* (non-Javadoc)
   * @see com.jpmorrsn.javaFBP.Component#introspect()
   */
  @Override
  protected Object[] introspect() {
    // TODO Auto-generated method stub
    return new Object[] {
        "Takes a string and converts it into a series of NARS actions",
        "STRING", "string", String.class, "A string to parse",
        "LOGIC", "logic", LogicAction.class, "A sequence of logical actions",
        "CONTROL", "control", ControlAction.class, "A sequence of control actions"
    };
  }

  /* (non-Javadoc)
   * @see com.jpmorrsn.javaFBP.Component#openPorts()
   */
  @Override
  protected void openPorts() {
    this.stringPort = openInput("STRING");
    this.logicPort = openOutput("LOGIC");
    this.controlPort = openOutput("CONTROL");
  }
  
  protected abstract List<Action> parse(String str);

}
