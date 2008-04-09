/**
 * 
 */
package com.googlecode.opennars.core;

import com.jpmorrsn.javaFBP.InPort;
import com.jpmorrsn.javaFBP.InPorts;
import com.jpmorrsn.javaFBP.InputPort;
import com.jpmorrsn.javaFBP.OutPort;
import com.jpmorrsn.javaFBP.OutPorts;
import com.jpmorrsn.javaFBP.OutputPort;
import com.jpmorrsn.javaFBP.SubNet;

/**
 * <p>
 * The (abstract) base class for all NARS reasoners. Defines the basic external
 * interface of a reasoner.
 * </p>
 * @author jgeldart
 *
 */
@InPorts(value = { @InPort("INLOGIC"), @InPort("INCONTROL"), @InPort("PARAMETERS") })
@OutPorts(value = { @OutPort("OUTLOGIC"), @OutPort("OUTCONTROL") })
public class AbstractReasoner extends SubNet {

  @SuppressWarnings("unused")
  private InputPort inLogic;
  
  @SuppressWarnings("unused")
  private InputPort inControl;
  
  @SuppressWarnings("unused")
  private InputPort params;
  
  @SuppressWarnings("unused")
  private OutputPort outLogic;
  
  @SuppressWarnings("unused")
  private OutputPort outControl;
  
  @Override
  protected void openPorts() {
    super.openPorts();
    inLogic = this.openInput("INLOGIC");
    inControl = this.openInput("INCONTROL");
    params = this.openInput("PARAMETERS");
    outLogic = this.openOutput("OUTLOGIC");
    outControl = this.openOutput("OUTCONTROL");
  }
  
}
