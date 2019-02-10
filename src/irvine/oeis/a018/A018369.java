package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018369.
 * @author Sean A. Irvine
 */
public class A018369 extends FiniteSequence {

  /** Construct the sequence. */
  public A018369() {
    super(Cheetah.factor(276).divisorsSorted());
  }
}
