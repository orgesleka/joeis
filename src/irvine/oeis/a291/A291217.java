package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291217 p-INVERT of <code>(0,1,0,1,0,1,...)</code>, where <code>p(S) = 1 - S^3</code>.
 * @author Sean A. Irvine
 */
public class A291217 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291217() {
    super(new long[] {1, 0, -3, 1, 3, 0}, new long[] {0, 0, 1, 0, 3, 1});
  }
}
