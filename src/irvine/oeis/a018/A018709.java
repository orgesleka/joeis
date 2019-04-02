package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018709 Divisors of 897.
 * @author Sean A. Irvine
 */
public class A018709 extends FiniteSequence {

  /** Construct the sequence. */
  public A018709() {
    super(Cheetah.factor(897).divisorsSorted());
  }
}
