package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291728 p-INVERT of <code>(1,0,1,0,0,0,0,...)</code>, where <code>p(S) = 1 - S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A291728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291728() {
    super(new long[] {1, 0, 2, 1, 1, 1}, new long[] {1, 2, 4, 9, 17, 35});
  }
}
