package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169630 <code>a(n) = n</code> times the square of <code>Fibonacci(n)</code>.
 * @author Sean A. Irvine
 */
public class A169630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169630() {
    super(new long[] {-1, 4, 0, -10, 0, 4}, new long[] {0, 1, 2, 12, 36, 125});
  }
}
