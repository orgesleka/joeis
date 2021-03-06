package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157431 <code>4n^2 + 73n + 333</code>.
 * @author Sean A. Irvine
 */
public class A157431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157431() {
    super(new long[] {1, -3, 3}, new long[] {410, 495, 588});
  }
}
