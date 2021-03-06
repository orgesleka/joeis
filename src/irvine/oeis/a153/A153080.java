package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153080 <code>a(n) = 13*n + 2</code>.
 * @author Sean A. Irvine
 */
public class A153080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153080() {
    super(new long[] {-1, 2}, new long[] {2, 15});
  }
}
