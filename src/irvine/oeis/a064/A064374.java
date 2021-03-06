package irvine.oeis.a064;

import irvine.oeis.FiniteSequence;

/**
 * A064374 Numbers k such that <code>sigma(k) &gt; phi(k)^2</code>.
 * @author Georg Fischer
 */
public class A064374 extends FiniteSequence {

  /** Construct the sequence. */
  public A064374() {
    super(2, 4, 6, 10, 12, 18, 30);
  }
}
