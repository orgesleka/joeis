package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054856 Number of ways to tile a <code>4 X n</code> region with <code>1 X 1, 2 X 2, 3 X 3</code> and <code>4 X 4</code> tiles.
 * @author Sean A. Irvine
 */
public class A054856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054856() {
    super(new long[] {-1, -1, 0, 3, 2}, new long[] {1, 1, 5, 13, 40});
  }
}
