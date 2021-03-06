package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003476 <code>a(n) = a(n-1) + 2a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A003476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003476() {
    super(new long[] {2, 0, 1}, new long[] {1, 2, 3});
  }
}

