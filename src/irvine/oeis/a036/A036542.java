package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036542 <code>a(n) = T(n, n)</code>, array T given by <code>A047858</code>.
 * @author Sean A. Irvine
 */
public class A036542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036542() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 3, 11, 34});
  }
}
