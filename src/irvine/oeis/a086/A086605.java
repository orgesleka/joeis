package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086605 <code>9n^3-18n^2+10n</code>.
 * @author Sean A. Irvine
 */
public class A086605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086605() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 20, 111});
  }
}
