package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229522 Final digit (in decimal system) of <code>(n^n)^n</code>, i.e., <code>(n^n)^n mod 10</code>.
 * @author Sean A. Irvine
 */
public class A229522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229522() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 6, 3, 6, 5, 6, 7, 6, 9, 0});
  }
}
