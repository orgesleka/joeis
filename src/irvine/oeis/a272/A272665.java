package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272665 Imaginary parts of <code>b(n)</code> sequence used to define <code>A143056</code>.
 * @author Sean A. Irvine
 */
public class A272665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272665() {
    super(new long[] {-1, -2, 0, 2}, new long[] {0, 0, 1, 2});
  }
}
