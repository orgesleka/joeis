package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269044 <code>a(n) = 13*n + 7</code>.
 * @author Sean A. Irvine
 */
public class A269044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269044() {
    super(new long[] {-1, 2}, new long[] {7, 20});
  }
}
