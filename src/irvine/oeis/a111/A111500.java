package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111500 Number of squares in an <code>n X n</code> grid of squares with diagonals.
 * @author Sean A. Irvine
 */
public class A111500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111500() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 10, 31, 72, 137});
  }
}
