package irvine.oeis.a079;

import irvine.oeis.FiniteSequence;

/**
 * A079016 Suppose p and q <code>= p+12</code> are primes. Define the difference pattern of <code>(p,q)</code> to be the successive differences of the primes in the range p to q. There are 14 possible difference patterns, namely <code>[12], [2,10], [4,8], [6,6], [8,4], [10,2], [2,4,6], [2,6,4], [4,2,6], [4,6,2], [6,2,4], [6,4,2], [2,4,2,4]</code> and <code>[4,2,4,2]</code>. Sequence gives smallest value of p for each difference pattern, sorted by magnitude.
 * @author Georg Fischer
 */
public class A079016 extends FiniteSequence {

  /** Construct the sequence. */
  public A079016() {
    super(5, 7, 17, 19, 29, 31, 47, 67, 89, 137, 139, 199, 397, 1601);
  }
}
