package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016571 Continued fraction for <code>log(87/2)</code>.
 * @author Sean A. Irvine
 */
public class A016571 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016571() {
    super(new A016620());
  }
}
