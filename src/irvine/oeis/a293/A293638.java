package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293638 <code>a(n)</code> is the integer k that minimizes <code>|k/Fibonacci(n) - 1/5|</code>.
 * @author Sean A. Irvine
 */
public class A293638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293638() {
    super(new long[] {1, 1, -2, -1, 2, 1, -2, -1, 2, 1}, new long[] {0, 0, 0, 0, 1, 1, 2, 3, 4, 7});
  }
}
