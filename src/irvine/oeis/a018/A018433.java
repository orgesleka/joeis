package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018433 Divisors of 400.
 * @author Sean A. Irvine
 */
public class A018433 extends FiniteSequence {

  /** Construct the sequence. */
  public A018433() {
    super(Cheetah.factor(400).divisorsSorted());
  }
}
