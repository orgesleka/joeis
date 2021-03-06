package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018692 Divisors of 868.
 * @author Sean A. Irvine
 */
public class A018692 extends FiniteSequence {

  /** Construct the sequence. */
  public A018692() {
    super(Cheetah.factor(868).divisorsSorted());
  }
}
