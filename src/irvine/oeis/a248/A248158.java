package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248158 Expansion of <code>(1 - 2*x^2)/(1 + x)^3</code>. Second column of Riordan triangle <code>A248156</code>.
 * @author Sean A. Irvine
 */
public class A248158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248158() {
    super(new long[] {-1, -3, -3}, new long[] {1, -3, 4});
  }
}
