package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275910 Numbers not congruent to <code>0, 1</code> or <code>8 mod 9</code>.
 * @author Sean A. Irvine
 */
public class A275910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275910() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {2, 3, 4, 5, 6, 7, 11});
  }
}
