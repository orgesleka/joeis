package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292478 p-INVERT of <code>A010892</code>, where <code>p(S) = 1 - S - S^3</code>.
 * @author Sean A. Irvine
 */
public class A292478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292478() {
    super(new long[] {-1, 4, -8, 11, -8, 4}, new long[] {1, 2, 4, 9, 19, 36});
  }
}
