package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077238 Combined Diophantine Chebyshev sequences <code>A077236</code> and <code>A077235</code>.
 * @author Sean A. Irvine
 */
public class A077238 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077238() {
    super(new long[] {-1, 0, 4, 0}, new long[] {4, 5, 11, 16});
  }
}
