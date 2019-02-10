package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018484.
 * @author Sean A. Irvine
 */
public class A018484 extends FiniteSequence {

  /** Construct the sequence. */
  public A018484() {
    super(Cheetah.factor(492).divisorsSorted());
  }
}
