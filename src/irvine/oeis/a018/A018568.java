package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018568 Divisors of 645.
 * @author Sean A. Irvine
 */
public class A018568 extends FiniteSequence {

  /** Construct the sequence. */
  public A018568() {
    super(Cheetah.factor(645).divisorsSorted());
  }
}
