package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167825 Subsequence of <code>A167709</code> whose indices are congruent to <code>4 mod 5</code>, i.e., <code>a(n) = A167709(5*n+4)</code>.
 * @author Sean A. Irvine
 */
public class A167825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167825() {
    super(new long[] {-1, 340}, new long[] {220, 74801});
  }
}
