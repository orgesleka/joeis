package irvine.oeis.a104;

import irvine.oeis.FiniteSequence;

/**
 * A104905 Numbers n such that <code>d(n)*phi(n)=sigma(n)</code>, where <code>d(n)</code> is number of positive divisors of n.
 * @author Georg Fischer
 */
public class A104905 extends FiniteSequence {

  /** Construct the sequence. */
  public A104905() {
    super(1, 3, 14, 42);
  }
}
