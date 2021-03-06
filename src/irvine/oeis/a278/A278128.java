package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278128 <code>a(n) = 288*2^n - 156</code>.
 * @author Sean A. Irvine
 */
public class A278128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278128() {
    super(new long[] {-2, 3}, new long[] {132, 420});
  }
}
