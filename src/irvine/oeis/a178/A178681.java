package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178681 <code>a(n) = 6^n + 6</code>.
 * @author Sean A. Irvine
 */
public class A178681 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178681() {
    super(new long[] {-6, 7}, new long[] {7, 12});
  }
}
