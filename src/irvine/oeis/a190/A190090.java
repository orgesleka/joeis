package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190090 Diagonal sums of the triangular matrix <code>A190088</code>.
 * @author Sean A. Irvine
 */
public class A190090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190090() {
    super(new long[] {1, 0, -3, 6, 2, 2}, new long[] {1, 1, 4, 16, 42, 137});
  }
}
