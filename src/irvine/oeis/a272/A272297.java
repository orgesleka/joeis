package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272297 <code>a(n) = n^4 + 64</code>.
 * @author Sean A. Irvine
 */
public class A272297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272297() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {64, 65, 80, 145, 320});
  }
}
