package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018253.
 * @author Sean A. Irvine
 */
public class A018253 extends FiniteSequence {

  /** Construct the sequence. */
  public A018253() {
    super(Cheetah.factor(24).divisorsSorted());
  }
}
