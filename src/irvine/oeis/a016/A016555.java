package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016555 Continued fraction for <code>log(55/2)</code>.
 * @author Sean A. Irvine
 */
public class A016555 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016555() {
    super(new A016604());
  }
}
