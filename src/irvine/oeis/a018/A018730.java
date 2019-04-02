package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018730 Divisors of 935.
 * @author Sean A. Irvine
 */
public class A018730 extends FiniteSequence {

  /** Construct the sequence. */
  public A018730() {
    super(Cheetah.factor(935).divisorsSorted());
  }
}
