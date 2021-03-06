package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175812 Partial sums of <code>ceiling(n^2/6)</code>.
 * @author Sean A. Irvine
 */
public class A175812 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175812() {
    super(new long[] {-1, 2, 0, -1, -1, 0, 2}, new long[] {0, 1, 2, 4, 7, 12, 18});
  }
}
