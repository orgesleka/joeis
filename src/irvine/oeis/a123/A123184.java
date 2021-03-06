package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123184 A linear sum zero <code>9 X 9</code> matrix Markov: characteristic polynomial: <code>(-3 + x)(-1 + x) x^3 (-1 + 3 x + 27 x^2 - 12 x^3 + x^4)</code>.
 * @author Sean A. Irvine
 */
public class A123184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123184() {
    super(new long[] {-1, 4, 24, -39, 13}, new long[] {1, 1, 3, 15, 103});
  }
}
