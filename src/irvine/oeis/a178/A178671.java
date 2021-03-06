package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178671 <code>a(n) = 5^n - 5</code>.
 * @author Sean A. Irvine
 */
public class A178671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178671() {
    super(new long[] {-5, 6}, new long[] {-4, 0});
  }
}
