package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018549 Divisors of 610.
 * @author Sean A. Irvine
 */
public class A018549 extends FiniteSequence {

  /** Construct the sequence. */
  public A018549() {
    super(Cheetah.factor(610).divisorsSorted());
  }
}
