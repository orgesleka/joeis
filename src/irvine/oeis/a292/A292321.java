package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292321 p-INVERT of <code>(1,0,0,1,0,0,1,0,0,...)</code>, where <code>p(S) = 1 - S^2 - S^3</code>.
 * @author Sean A. Irvine
 */
public class A292321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292321() {
    super(new long[] {1, 0, 0, -3, -1, 0, 4, 1, 0}, new long[] {0, 1, 1, 1, 4, 5, 7, 17, 23});
  }
}
