package irvine.oeis.a019;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a161.A161011;

/**
 * A019425 Continued fraction for <code>tan(1/2)</code>.
 * @author Sean A. Irvine
 */
public class A019425 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019425() {
    super(new A161011());
  }
}
