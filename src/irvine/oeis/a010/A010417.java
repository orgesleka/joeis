package irvine.oeis.a010;

import irvine.oeis.FiniteSequence;

/**
 * A010417 Squares <code>mod 56</code>.
 * @author Sean A. Irvine
 */
public class A010417 extends FiniteSequence {

  /**
   * Construct the sequence.
   */
  public A010417() {
    super(0, 1, 4, 8, 9, 16, 25, 28, 32, 36, 44, 49);
  }
}
