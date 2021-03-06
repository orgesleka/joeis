package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188653 Second differences of <code>A000463</code>; first differences of <code>A188652</code>.
 * @author Sean A. Irvine
 */
public class A188653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188653() {
    super(new long[] {1, 2, 0, -2}, new long[] {1, 1, -3, 7});
  }
}
