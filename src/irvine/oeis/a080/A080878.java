package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080878 <code>a(n)*a(n+3) - a(n+1)*a(n+2) = 2^n</code>, given <code>a(0)=1, a(1)=1, a(2)=3</code>.
 * @author Sean A. Irvine
 */
public class A080878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080878() {
    super(new long[] {-4, 0, 6, 0}, new long[] {1, 1, 3, 4});
  }
}
