package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028560 <code>a(n) = n*(n + 6)</code>, also numbers <code>a(n)</code> such that <code>9*(9 + a(n))</code> is a perfect square.
 * @author Sean A. Irvine
 */
public class A028560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028560() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 16});
  }
}
