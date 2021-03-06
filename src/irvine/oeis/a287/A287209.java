package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287209 <code>a(1)=4, a(2)=5, a(n) =</code> sum of digits of <code>a(n-1) +</code> sum of digits of <code>a(n-2), n&gt;=3</code>.
 * @author Sean A. Irvine
 */
public class A287209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287209() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}, new long[] {4, 5, 9, 14, 14, 10, 6, 7, 13, 11, 6, 8, 14, 13, 9, 13, 13, 8, 12, 11, 5, 7, 12});
  }
}
