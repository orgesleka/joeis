package irvine.oeis.a055;

import irvine.oeis.FiniteSequence;

/**
 * A055159 n has distinct digits in ascending order and <code>n=a-b</code> where a has the digits of n in descending order and b has the digits of n in another order <code>(a</code> and b perhaps with extra zeros).
 * @author Georg Fischer
 */
public class A055159 extends FiniteSequence {

  /** Construct the sequence. */
  public A055159() {
    super(459, 1467, 1245789, 123456789L, 123456789L);
  }
}
