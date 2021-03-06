package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227849 <code>a(n) = 2 * floor( 3/14 * n^2)</code> if n even, <code>a(n) = 2 * round( 3/14 * n^2) -1</code> if n odd.
 * @author Sean A. Irvine
 */
public class A227849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227849() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, -1, 2}, new long[] {0, -1, 0, 3, 6, 9, 14, 21, 26});
  }
}
