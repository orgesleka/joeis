package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203573 Bisection of <code>A099924</code> (convolution of Lucas numbers); even arguments.
 * @author Sean A. Irvine
 */
public class A203573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203573() {
    super(new long[] {-1, 6, -11, 6}, new long[] {4, 13, 45, 152});
  }
}
