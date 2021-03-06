package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084154 Binomial transform of <code>sinh(x)*cosh(sqrt(2)*x)</code>.
 * @author Sean A. Irvine
 */
public class A084154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084154() {
    super(new long[] {4, -8, 0, 4}, new long[] {0, 1, 2, 10});
  }
}
