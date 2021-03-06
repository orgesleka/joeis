package irvine.oeis.a003;

import irvine.oeis.FiniteSequence;

/**
 * A003552 Divisors of <code>2^47 - 1</code>.
 * @author Sean A. Irvine
 */
public class A003552 extends FiniteSequence {

  /** Construct the sequence. */
  public A003552() {
    super(A003529.divisors(47));
  }
}

