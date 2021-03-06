package irvine.oeis.a322;

import irvine.oeis.FiniteSequence;

/**
 * A322548 Integers x such that <code>x^2 + 119 = 15*2^y</code>.
 * @author Georg Fischer
 */
public class A322548 extends FiniteSequence {

  /** Construct the sequence. */
  public A322548() {
    super(1, 11, 19, 29, 61, 701);
  }
}
