package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157040 <code>121n^2 - 2n</code>.
 * @author Sean A. Irvine
 */
public class A157040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157040() {
    super(new long[] {1, -3, 3}, new long[] {119, 480, 1083});
  }
}
