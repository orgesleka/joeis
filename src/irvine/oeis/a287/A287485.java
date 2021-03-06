package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287485 Number of independent vertex sets and vertex covers in the n-web graph.
 * @author Sean A. Irvine
 */
public class A287485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287485() {
    super(new long[] {4, 8, 2}, new long[] {2, 20, 68});
  }
}
