package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128801 <code>a(n) = n*(n-1)*7^n</code>.
 * @author Sean A. Irvine
 */
public class A128801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128801() {
    super(new long[] {343, -147, 21}, new long[] {0, 98, 2058});
  }
}
