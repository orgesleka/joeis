package irvine.oeis.a257;

import irvine.oeis.FiniteSequence;

/**
 * A257116 Smallest prime p such that none of p <code>+ 1, p + 3,... p + 2n - 1</code> are squarefree and all of p <code>+ 2, p + 4,... p + 2n</code> are squarefree.
 * @author Georg Fischer
 */
public class A257116 extends FiniteSequence {

  /** Construct the sequence. */
  public A257116() {
    super(3, 17, 487, 947, 947, 38639, 38639);
  }
}
