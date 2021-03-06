package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049669 <code>a(n) = Fibonacci(9*n)/34</code>.
 * @author Sean A. Irvine
 */
public class A049669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049669() {
    super(new long[] {1, 76}, new long[] {0, 1});
  }
}
