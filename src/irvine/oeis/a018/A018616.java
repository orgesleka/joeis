package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018616 Divisors of 732.
 * @author Sean A. Irvine
 */
public class A018616 extends FiniteSequence {

  /** Construct the sequence. */
  public A018616() {
    super(Cheetah.factor(732).divisorsSorted());
  }
}
