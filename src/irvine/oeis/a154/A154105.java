package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154105 <code>a(n) = 12*n^2 + 18*n + 7</code>.
 * @author Sean A. Irvine
 */
public class A154105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154105() {
    super(new long[] {1, -3, 3}, new long[] {7, 37, 91});
  }
}
