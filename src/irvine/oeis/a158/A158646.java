package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158646 <code>a(n) = 54*n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A158646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158646() {
    super(new long[] {1, -3, 3}, new long[] {1, 55, 217});
  }
}
