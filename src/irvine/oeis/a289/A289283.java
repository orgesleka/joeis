package irvine.oeis.a289;

import irvine.oeis.FiniteSequence;

/**
 * A289283 Starting with <code>a(1) = 1, a(n) =</code> smallest nonnegative integer not yet in the sequence such that the last digit of <code>a(n-1)</code> plus the first digit of <code>a(n)</code> is equal to 5. The digit 0 is not allowed.
 * @author Georg Fischer
 */
public class A289283 extends FiniteSequence {

  /** Construct the sequence. */
  public A289283() {
    super(1, 4, 11, 41, 42, 3, 2, 31, 43, 21, 44, 12, 32, 33, 22, 34, 13, 23, 24, 14, 15);
  }
}
