package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014097 <code>a(n) = a(n-1)+a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A014097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014097() {
    super(new long[] {1, 0, 0, 1}, new long[] {1, 1, 1, 5});
  }
}
