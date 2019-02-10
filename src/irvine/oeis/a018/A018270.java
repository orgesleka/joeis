package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018270.
 * @author Sean A. Irvine
 */
public class A018270 extends FiniteSequence {

  /** Construct the sequence. */
  public A018270() {
    super(Cheetah.factor(70).divisorsSorted());
  }
}

