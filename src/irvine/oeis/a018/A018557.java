package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018557 Divisors of 627.
 * @author Sean A. Irvine
 */
public class A018557 extends FiniteSequence {

  /** Construct the sequence. */
  public A018557() {
    super(Cheetah.factor(627).divisorsSorted());
  }
}
