package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139744 <code>a(n) = 11^n - 6^n</code>.
 * @author Sean A. Irvine
 */
public class A139744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139744() {
    super(new long[] {-66, 17}, new long[] {0, 5});
  }
}
