package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018296 Divisors of 130.
 * @author Sean A. Irvine
 */
public class A018296 extends FiniteSequence {

  /** Construct the sequence. */
  public A018296() {
    super(Cheetah.factor(130).divisorsSorted());
  }
}
