package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067331 Convolution of Fibonacci <code>F(n+1), n&gt;=0</code>, with <code>F(n+3), n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A067331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067331() {
    super(new long[] {-1, -2, 1, 2}, new long[] {2, 5, 12, 25});
  }
}
