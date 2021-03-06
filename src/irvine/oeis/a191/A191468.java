package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191468 <code>8^n - 5^n</code>.
 * @author Sean A. Irvine
 */
public class A191468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191468() {
    super(new long[] {-40, 13}, new long[] {0, 3});
  }
}
