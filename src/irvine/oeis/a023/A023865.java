package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023865 a(n) = s(1)t(n)+s(2)t(n-1)+...+s(k)t(n+1-k), where k=[ (n+1)/2 ], s = (natural numbers), t = (odd numbers).
 * @author Sean A. Irvine
 */
public class A023865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023865() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 3, 11, 17, 38, 50, 90});
  }
}
