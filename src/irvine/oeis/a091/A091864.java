package irvine.oeis.a091;

import irvine.oeis.FiniteSequence;

/**
 * A091864 Positive integers n such that <code>Sum_{p&lt;=pi(n)} p =</code> n, where <code>pi(x)</code> denotes the number of primes not exceeding x and the summation is over primes p.
 * @author Georg Fischer
 */
public class A091864 extends FiniteSequence {

  /** Construct the sequence. */
  public A091864() {
    super(5, 17, 41, 77, 100);
  }
}
