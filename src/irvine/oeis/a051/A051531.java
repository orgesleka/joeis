package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051531 Molien series for group <code>H_{1,3}^{8}</code> of order 2304.
 * @author Sean A. Irvine
 */
public class A051531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051531() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {1, 1, 4, 15, 24, 44, 81, 115});
  }
}
