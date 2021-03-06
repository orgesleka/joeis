package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122015 <code>Semi-Linear</code> (two branches) twist isomer bonding <code>8 X 8</code> matrix Markov: (change to second permutation <code>4 X 4)</code> Characteristic polynomial: <code>(1 + 4 x + 6 x^2 + 4 x^3 - x^4 - 4 x^5 - 3 x^6 + x^8)</code>.
 * @author Sean A. Irvine
 */
public class A122015 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122015() {
    super(new long[] {-1, -4, -6, -4, 1, 4, 3, 0}, new long[] {1, 11, 41, 54, 129, 256, 529, 1083});
  }
}
