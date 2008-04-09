/**
 * 
 */
package com.googlecode.opennars.language;

import java.util.Map;

/**
 * <p>
 * <code>Action</code> is the interface all NARS language terms must comply
 * with. The interface supports the annotation of a term with metadata which
 * may be used to support things such as source identification or various
 * forms of control strategy. This interface is kept as light as possible to
 * avoid enforcing a particular form of strategy on a system.
 * </p>
 * <p>
 * The metadata on an action should be preserved through inferences
 * <i>unless</i> otherwise specified by the control strategy. This means that
 * answers to questions, for example, will still have the same 'origin'
 * metadata to allow routing of the answer to the correct agent. Exceptions to
 * the preservation property should be <i>explicitly</i> mentioned in the
 * documentation of a reasoner.
 * </p>
 * 
 * @author jgeldart
 *
 */
public interface Action {
  
  /**
   * <p>
   * Returns a map of keys to objects representing the metadata on this action.
   * </p>
   * @return The metadata map for the action.
   */
  public Map<String, Object> getMetadata();
  
  /**
   * <p>
   * Replace all the metadata on an action at the same time using the provided
   * map.
   * </p>
   * @param meta The map of metadata to use as a replacement.
   */
  public void replaceMetadata(Map<String, Object> meta);
  
  /**
   * <p>
   * Get a specific piece of metadata on the action by its <code>String</code>
   * key.
   * </p>
   * @param key The key of the piece of metadata to return.
   * @return The appropriate piece of metadata or <code>null</code> if no such data exists.
   */
  public Object getMetadataByKey(String key);
  
  /**
   * <p>
   * Sets a specific piece of metadata on the action according to its
   * <code>String</code> key.
   * </p>
   * @param key The key of the metadata to set. 
   * @param meta The metadata object to set with.
   */
  public void setMetadataByKey(String key, Object meta);

}
