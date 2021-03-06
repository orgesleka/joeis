package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099621 Sum <code>C(n-k,k+1)3^(n-k-1)(4/3)^k, k=0..floor(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A099621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099621() {
    super(new long[] {-12, -5, 6}, new long[] {0, 1, 6});
  }
}
