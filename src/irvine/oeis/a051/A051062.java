package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051062 <code>a(n) = 16*n + 8</code>.
 * @author Sean A. Irvine
 */
public class A051062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051062() {
    super(new long[] {-1, 2}, new long[] {8, 24});
  }
}
