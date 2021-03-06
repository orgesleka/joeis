package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099903 Sum of all matrix elements of <code>n X n</code> matrix <code>M(i,j) = i^3+j^3, (i,j = 1..n). a(n) = n^3*(n+1)^2/2</code>.
 * @author Sean A. Irvine
 */
public class A099903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099903() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {2, 36, 216, 800, 2250, 5292});
  }
}
