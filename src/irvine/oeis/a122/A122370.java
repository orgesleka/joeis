package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122370 Dimension of <code>6-variable non-commutative</code> harmonics (twisted derivative). The dimension of the space of non-commutative polynomials in 6 variables which are killed by all symmetric differential operators (where for a monomial w, <code>d_{xi} (</code> xi w <code>) =</code> w and <code>d_{xi} ( xj w ) = 0</code> for <code>i/=j)</code>.
 * @author Sean A. Irvine
 */
public class A122370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122370() {
    super(new long[] {53, -189, 192, -81, 15}, new long[] {1, 5, 29, 172, 1026});
  }
}
