package irvine.oeis.a298;

import irvine.oeis.FiniteSequence;

/**
 * A298048 <code>a(1) =</code> number of 1-digit primes (that is, <code>4: 2,3,5,7)</code>; then <code>a(n) =</code> number of distinct n-digit prime numbers obtained by <code>left-</code> or right-concatenating a digit to the <code>a(n-1)</code> primes obtained in the previous iteration.
 * @author Georg Fischer
 */
public class A298048 extends FiniteSequence {

  /** Construct the sequence. */
  public A298048() {
    super(4, 16, 70, 243, 638, 1450, 2819, 4951, 7629, 10677, 13267, 15182, 15923, 15796, 14369, 12547, 10291, 7939, 5703, 3911, 2559, 1595, 920, 561, 321, 167, 72, 37, 11, 6, 3);
  }
}
