package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140870 <code>8*P_4(2n), 8</code> times the Legendre Polynomial of order 4 at <code>2n</code>.
 * @author Sean A. Irvine
 */
public class A140870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140870() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {3, 443, 8483, 44283, 141443});
  }
}
