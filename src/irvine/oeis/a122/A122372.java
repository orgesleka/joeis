package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122372 Dimension of <code>8-variable non-commutative</code> harmonics (twisted derivative). The dimension of the space of non-commutative polynomials in 8 variables which are killed by all symmetric differential operators (where for a monomial w, <code>d_{xi} (</code> xi w <code>) =</code> w and <code>d_{xi} ( xj w ) = 0</code> for <code>i/=j)</code>.
 * @author Sean A. Irvine
 */
public class A122372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122372() {
    super(new long[] {2119, -8249, 10190, -5925, 1845, -316, 28}, new long[] {1, 7, 55, 438, 3498, 27962, 223604});
  }
}
