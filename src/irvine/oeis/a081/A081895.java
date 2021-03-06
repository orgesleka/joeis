package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081895 Second binomial transform of <code>binomial(n+3, 3)</code>.
 * @author Sean A. Irvine
 */
public class A081895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081895() {
    super(new long[] {-81, 108, -54, 12}, new long[] {1, 6, 30, 136});
  }
}
