package irvine.oeis.a153;

import irvine.oeis.FiniteSequence;

/**
 * A153749 Numbers n such that there are 12 digits in <code>n^2</code> and for each factor f of <code>12 (1,2,3,4,6)</code> the sum of digit groupings of size f is a square.
 * @author Georg Fischer
 */
public class A153749 extends FiniteSequence {

  /** Construct the sequence. */
  public A153749() {
    super(316713, 334401, 658635);
  }
}
