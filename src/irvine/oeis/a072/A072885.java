package irvine.oeis.a072;

import irvine.oeis.FiniteSequence;

/**
 * A072885 Primes p with a prime number of digits in all base b with <code>1 &lt;= b &lt;=</code> p.
 * @author Georg Fischer
 */
public class A072885 extends FiniteSequence {

  /** Construct the sequence. */
  public A072885() {
    super(2, 3, 5, 7, 17, 19, 23);
  }
}
