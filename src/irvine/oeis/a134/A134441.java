package irvine.oeis.a134;

import irvine.oeis.FiniteSequence;

/**
 * A134441 Last two digits of primes of form <code>4n+1 (A002144)</code>, excluding 5. Leading <code>0</code>'s omitted.
 * @author Georg Fischer
 */
public class A134441 extends FiniteSequence {

  /** Construct the sequence. */
  public A134441() {
    super(1, 9, 13, 17, 21, 29, 33, 37, 41, 49, 53, 57, 61, 69, 73, 77, 81, 89, 93, 97);
  }
}
