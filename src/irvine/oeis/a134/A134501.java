package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134501 <code>a(n) = Fibonacci(7n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A134501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134501() {
    super(new long[] {1, 29}, new long[] {2, 55});
  }
}
