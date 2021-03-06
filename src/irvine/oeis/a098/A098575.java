package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098575 <code>a(n) = Sum_{k=0..floor(n/4)} C(n-2*k,2*k)*2^k</code>.
 * @author Sean A. Irvine
 */
public class A098575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098575() {
    super(new long[] {2, 0, -1, 2}, new long[] {1, 1, 1, 1});
  }
}
