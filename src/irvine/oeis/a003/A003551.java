package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003551 Divisors of <code>2^46 - 1</code>.
 * @author Sean A. Irvine
 */
public class A003551 extends FiniteSequence {

  /** Construct the sequence. */
  public A003551() {
    super(A003529.divisors(46));
  }
}

