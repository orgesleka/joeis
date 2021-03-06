package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167820 Subsequence of <code>A167709</code> whose indices are congruent to <code>0 mod 5</code>, i.e., <code>a(n) = A167709(5*n)</code>.
 * @author Sean A. Irvine
 */
public class A167820 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167820() {
    super(new long[] {-1, 340}, new long[] {0, 351});
  }
}
