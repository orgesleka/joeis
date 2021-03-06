package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293547 <code>a(n)</code> is the integer k that minimizes <code>|k/Fibonacci(n) - 2/3|</code>.
 * @author Sean A. Irvine
 */
public class A293547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293547() {
    super(new long[] {1, 1, -1, 0, 1, 1}, new long[] {0, 1, 1, 1, 2, 3});
  }
}
