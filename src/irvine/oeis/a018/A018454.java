package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018454.
 * @author Sean A. Irvine
 */
public class A018454 extends FiniteSequence {

  /** Construct the sequence. */
  public A018454() {
    super(Cheetah.factor(435).divisorsSorted());
  }
}