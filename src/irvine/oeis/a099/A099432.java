package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099432 Convolution of <code>A030195(n)</code> (generalized <code>(3,3)-Fibonacci)</code> with itself.
 * @author Sean A. Irvine
 */
public class A099432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099432() {
    super(new long[] {-9, -18, -3, 6}, new long[] {1, 6, 33, 162});
  }
}
