package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267313 Expansion of <code>x*(1 - 2*x - 3*x^2 + 2*x^3 - x^4)/( x^7 - x^6 - 2*x^4 + 2*x^3 + x - 1)</code>.
 * @author Sean A. Irvine
 */
public class A267313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267313() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {0, -1, 1, 4, 0, 5, 11});
  }
}
