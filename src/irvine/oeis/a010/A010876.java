package irvine.oeis.a010;

import irvine.oeis.PeriodicSequence;

/**
 * A010876 <code>a(n) = n mod 7</code>.
 * @author Sean A. Irvine
 */
public class A010876 extends PeriodicSequence {

  /** Construct the sequence. */
  public A010876() {
    super(0, 1, 2, 3, 4, 5, 6);
  }
}

