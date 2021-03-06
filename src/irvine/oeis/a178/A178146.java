package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178146 <code>a(n)</code> is the number of distinct divisors d of n of the form <code>d=2,3</code> or 5.
 * @author Sean A. Irvine
 */
public class A178146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178146() {
    super(new long[] {1, 2, 2, 1, 0, -1, -2, -2}, new long[] {0, 1, 1, 1, 1, 2, 0, 1});
  }
}
