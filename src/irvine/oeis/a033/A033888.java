package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033888 <code>a(n) = Fibonacci(4n)</code>.
 * @author Sean A. Irvine
 */
public class A033888 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033888() {
    super(new long[] {-1, 7}, new long[] {0, 3});
  }
}
