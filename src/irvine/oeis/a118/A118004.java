package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118004 <code>a(n) = 9^n - 4^n</code>.
 * @author Sean A. Irvine
 */
public class A118004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118004() {
    super(new long[] {-36, 13}, new long[] {0, 5});
  }
}
