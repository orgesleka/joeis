package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018599 Divisors of 702.
 * @author Sean A. Irvine
 */
public class A018599 extends FiniteSequence {

  /** Construct the sequence. */
  public A018599() {
    super(Cheetah.factor(702).divisorsSorted());
  }
}
