package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049666 <code>a(n) = Fibonacci(5*n)/5</code>.
 * @author Sean A. Irvine
 */
public class A049666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049666() {
    super(new long[] {1, 11}, new long[] {0, 1});
  }
}
