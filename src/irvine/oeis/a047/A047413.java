package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047413 Numbers that are congruent to <code>{3, 4, 6} mod 8</code>.
 * @author Sean A. Irvine
 */
public class A047413 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047413() {
    super(new long[] {-1, 1, 0, 1}, new long[] {3, 4, 6, 11});
  }
}
