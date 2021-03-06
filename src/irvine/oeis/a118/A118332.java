package irvine.oeis.a118;

import irvine.oeis.FiniteSequence;

/**
 * A118332 Primes of the form <code>n!! + (n+1)!!</code>.
 * @author Georg Fischer
 */
public class A118332 extends FiniteSequence {

  /** Construct the sequence. */
  public A118332() {
    super(2, 3, 5, 11, 23);
  }
}
