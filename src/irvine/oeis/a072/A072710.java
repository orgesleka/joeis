package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072710 Last digit of <code>F(n)</code> is 8 where <code>F(n)</code> is the n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A072710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072710() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {6, 24, 27, 33, 66});
  }
}
