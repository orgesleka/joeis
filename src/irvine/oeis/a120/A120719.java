package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120719 Second level Hadamard-Sylvester matrix self-similarity for the <code>2 X 2</code> Fibonacci matrix as a <code>16 X 16</code> matrix Markov ( made using an array repartitioning method) Characteristic <code>Polynomial:1 - x - 40 x^2 - 45 x^3 + 285 x^4 + 272 x^5 - 1022 x^6 - 370 x^7 + 1840 x^8 - 370 x^9 - 1022 x^10 + 272 x^11 + 285 x^12 - 45 x^13 - 40x^14 - x^15 + x^16</code>.
 * @author Sean A. Irvine
 */
public class A120719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120719() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {0, 610, 1596, 16500, 97410});
  }
}
