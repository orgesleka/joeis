package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018434.
 * @author Sean A. Irvine
 */
public class A018434 extends FiniteSequence {

  /** Construct the sequence. */
  public A018434() {
    super(Cheetah.factor(402).divisorsSorted());
  }
}