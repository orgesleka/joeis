package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018522.
 * @author Sean A. Irvine
 */
public class A018522 extends FiniteSequence {

  /** Construct the sequence. */
  public A018522() {
    super(Cheetah.factor(567).divisorsSorted());
  }
}