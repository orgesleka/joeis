package irvine.oeis.a240;

import irvine.oeis.FiniteSequence;

/**
 * A240670 Numbers n for which all exponents in the prime power factorization of <code>(2*n)!</code> are odious <code>(A000069)</code>.
 * @author Georg Fischer
 */
public class A240670 extends FiniteSequence {

  /** Construct the sequence. */
  public A240670() {
    super(1, 3, 4, 5, 15, 16);
  }
}
