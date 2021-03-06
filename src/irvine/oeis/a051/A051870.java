package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051870 <code>18-gonal</code> (or octadecagonal) numbers: <code>a(n) = n*(8*n-7)</code>.
 * @author Sean A. Irvine
 */
public class A051870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051870() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 18});
  }
}
