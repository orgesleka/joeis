package irvine.oeis.a019;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a161.A161014;

/**
 * A019428 Continued fraction for <code>tan(1/5)</code>.
 * @author Sean A. Irvine
 */
public class A019428 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019428() {
    super(new A161014());
  }
}
