package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002310 <code>a(n) = 5*a(n-1) - a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A002310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002310() {
    super(new long[] {-1, 5}, new long[] {1, 2});
  }
}
