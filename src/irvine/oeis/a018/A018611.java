package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018611 Divisors of 724.
 * @author Sean A. Irvine
 */
public class A018611 extends FiniteSequence {

  /** Construct the sequence. */
  public A018611() {
    super(Cheetah.factor(724).divisorsSorted());
  }
}
