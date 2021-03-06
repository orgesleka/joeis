package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100583 Number of triangles in an <code>n X n</code> grid of squares with diagonals.
 * @author Sean A. Irvine
 */
public class A100583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100583() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 8, 44, 124, 268});
  }
}
