package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076841 <code>a(1) = a(2) = 1; a(n) = (a(n-1)+1)/a(n-2)</code> (for <code>n&gt;2, n</code> odd), <code>(a(n-1)^3+1)/a(n-2)</code> (for <code>n&gt;2, n</code> even).
 * @author Sean A. Irvine
 */
public class A076841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076841() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 9, 5, 14, 3, 2});
  }
}
