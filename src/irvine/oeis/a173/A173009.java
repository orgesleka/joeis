package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173009 The mean value <code>m(n) = sum(k*p(n,k), k = 0</code> .. <code>2^n-n-1)</code> of the distribution function <code>p(n,k) := binomial(2^n-n-1, k)/2^(2^n-n-1)</code> is <code>0., 0.5, 2., 5.5, 13., 28.5, 60., 123.5, 251., 506.5, 1018., 2041.5, 4089., 8184.5..</code>. We set <code>A173009(n)=round(m(n))</code>.
 * @author Sean A. Irvine
 */
public class A173009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173009() {
    super(new long[] {2, -3, -1, 3}, new long[] {0, 1, 2, 6});
  }
}
