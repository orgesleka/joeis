package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217527 <code>a(n) = 2^(n-2)*(n-2)^2+2^(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A217527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217527() {
    super(new long[] {8, -12, 6}, new long[] {2, 6, 24});
  }
}
