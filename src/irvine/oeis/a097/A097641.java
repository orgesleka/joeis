package irvine.oeis.a097;

import irvine.oeis.FiniteSequence;

/**
 * A097641 Numbers n such that <code>n=d_1^pi(d_1)+d_2^pi(d_2)+...+d_k^pi(d_k)</code> where <code>d_1 d_2</code> ... <code>d_k</code> is the decimal expansion of n.
 * @author Georg Fischer
 */
public class A097641 extends FiniteSequence {

  /** Construct the sequence. */
  public A097641() {
    super(1, 2, 135, 2537);
  }
}
