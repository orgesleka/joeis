package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157728 <code>a(n) = Fibonacci(n) - 4</code>.
 * @author Sean A. Irvine
 */
public class A157728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157728() {
    super(new long[] {-1, 0, 2}, new long[] {1, 4, 9});
  }
}
