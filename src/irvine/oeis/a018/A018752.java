package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018752 Divisors of 972.
 * @author Sean A. Irvine
 */
public class A018752 extends FiniteSequence {

  /** Construct the sequence. */
  public A018752() {
    super(Cheetah.factor(972).divisorsSorted());
  }
}
