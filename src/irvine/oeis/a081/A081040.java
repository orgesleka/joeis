package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081040 5th binomial transform of <code>(1,4,0,0,0,0,....)</code>.
 * @author Sean A. Irvine
 */
public class A081040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081040() {
    super(new long[] {-25, 10}, new long[] {1, 9});
  }
}
