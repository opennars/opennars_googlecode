/**
 * 
 */
package com.googlecode.opennars.language.control;

import java.util.HashMap;
import java.util.Map;

import com.googlecode.opennars.language.logic.Term;
import com.googlecode.opennars.language.logic.TruthValue;

/**
 * The base class of all speech act type actions. A speech act includes such
 * things as telling, asking, commanding, etc.
 * 
 * @author jgeldart
 *
 */
public abstract class Sentence implements LogicAction {
  
  private Map<String, Object> metadata;
  private Term content;
  private TruthValue truth;

  public interface SentenceVisitor<R,A> extends Visitor<R, A> {
    
    public R visit(Sentence p, A arg);
    
  }
  
  public Sentence(Term term) {
    this.metadata = new HashMap<String,Object>();
    this.content = term;
    this.truth = null;
  }
  
  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.LogicAction#accept(com.googlecode.opennars.language.logic.LogicAction.Visitor, java.lang.Object)
   */
  public abstract <R, A> R accept(SentenceVisitor<R, A> visitor, A argument);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.Action#getMetadata()
   */
  public Map<String, Object> getMetadata() {
    return new HashMap<String,Object>(this.metadata);
  }

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.Action#getMetadataByKey(java.lang.String)
   */
  public Object getMetadataByKey(String key) {
    return this.metadata.get(key);
  }

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.Action#replaceMetadata(java.util.Map)
   */
  public void replaceMetadata(Map<String, Object> meta) {
    this.metadata = new HashMap<String,Object>(meta);
  }

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.Action#setMetadataByKey(java.lang.String, java.lang.Object)
   */
  public void setMetadataByKey(String key, Object meta) {
    this.metadata.put(key, meta);
  }

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.LogicAction#accept(com.googlecode.opennars.language.logic.LogicAction.Visitor, java.lang.Object)
   */
  public <R, A> R accept(Visitor<R, A> visitor, A argument) {
    return visitor.visit(this, argument);
  }

  /**
   * Set the truth value of this sentence.
   * @param truth The truth value to set.
   */
  public void setTruth(TruthValue truth) {
    this.truth = truth;
  }

  /**
   * Get the truth value of this sentence.
   * @return the truth value.
   */
  public TruthValue getTruth() {
    return truth;
  }
  
}
