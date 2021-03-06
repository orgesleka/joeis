package irvine.oeis.a079;

import irvine.oeis.FiniteSequence;

/**
 * A079541 Numbers n such that <code>phi(n) = d(n)</code>.
 * @author Georg Fischer
 */
public class A079541 extends FiniteSequence {

  /** Construct the sequence. */
  public A079541() {
    super(1, 3, 8, 10, 18, 24, 30);
  }
}
