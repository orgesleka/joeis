package irvine.oeis.a272;

import irvine.oeis.FiniteSequence;

/**
 * A272072 Nonnegative integers n such that <code>10^n</code> is not of the form <code>x^3 + y^3 + z^3</code> where <code>x &gt; y &gt; z &gt; 0</code>.
 * @author Georg Fischer
 */
public class A272072 extends FiniteSequence {

  /** Construct the sequence. */
  public A272072() {
    super(0, 1, 2, 3, 4, 5, 7, 10);
  }
}
