package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134169 <code>a(n) = 2^(n-1)*(2^n - 1) + 1</code>.
 * @author Sean A. Irvine
 */
public class A134169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134169() {
    super(new long[] {8, -14, 7}, new long[] {1, 2, 7});
  }
}
