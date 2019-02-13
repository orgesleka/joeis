package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018644.
 * @author Sean A. Irvine
 */
public class A018644 extends FiniteSequence {

  /** Construct the sequence. */
  public A018644() {
    super(Cheetah.factor(783).divisorsSorted());
  }
}