/**
 * 
 */
package com.googlecode.opennars.language.logic;

/**
 * A NARS two-component truth value. Includes convenience methods for making
 * a truth value in the form of a frequency and confidence, an evidence pair
 * and an interval form. For these conversions, a value for the horizon
 * parameter is required.
 * 
 * @author jgeldart
 *
 */
public class TruthValue {
  
  private float frequency;
  private float confidence;
  
  public TruthValue(float f, float c) {
    this.frequency = f;
    this.confidence = c;
  }
  
  public float getFrequency() {
    return this.frequency;
  }
  
  public float getConfidence() {
    return this.confidence;
  }
  
  public float getLowerBound() {
    return this.frequency * this.confidence;
  }
  
  public float getUpperBound() {
    return 1 - this.confidence * (1 - this.frequency);
  }
  
  public float getPositiveEvidence(int horizon) {
    return horizon * this.frequency * this.confidence / (1 - this.confidence);
  }
  
  public float getTotalEvidence(int horizon) {
    return horizon * this.confidence/(1 - this.confidence);
  }
  
  public float getExpectation() {
    return (float) (this.confidence * (this.frequency - 0.5) + 0.5);
  }
  
  public static TruthValue fromFrequencyConfidence(float f, float c) {
    return new TruthValue(f,c);
  }
  
  public static TruthValue fromBounds(float l, float u) {
    return new TruthValue(l/(1-(u-l)), 1 - u - l);
  }
  
  public static TruthValue fromEvidence(float wp, float w, int horizon) {
    return new TruthValue(wp/w, w/(w + horizon));
  }

}
