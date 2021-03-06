package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098251 Chebyshev polynomials <code>S(n,363)</code>.
 * @author Sean A. Irvine
 */
public class A098251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098251() {
    super(new long[] {-1, 363}, new long[] {1, 363});
  }
}
