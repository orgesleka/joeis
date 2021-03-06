package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081203 9th binomial transform of <code>(0,1,0,1,0,1,.....), A000035</code>.
 * @author Sean A. Irvine
 */
public class A081203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081203() {
    super(new long[] {-80, 18}, new long[] {0, 1});
  }
}
