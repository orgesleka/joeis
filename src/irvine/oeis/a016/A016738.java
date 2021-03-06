package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a002.A002392;

/**
 * A016738 Continued fraction for <code>log(10)</code>.
 * @author Sean A. Irvine
 */
public class A016738 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016738() {
    super(new A002392());
  }
}
