package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112651 Numbers n such that <code>n^2 (mod 11)</code> is congruent to <code>n (mod 11)</code>.
 * @author Sean A. Irvine
 */
public class A112651 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112651() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 11});
  }
}
