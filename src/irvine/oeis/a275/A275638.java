package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275638 Expansion of <code>(1-q)^k/Product_{j=1..k} (1-q^j)</code> for <code>k=4</code>.
 * @author Sean A. Irvine
 */
public class A275638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275638() {
    super(new long[] {-1, -3, -5, -6, -5, -3}, new long[] {1, -3, 4, -3, 2, -3});
  }
}
