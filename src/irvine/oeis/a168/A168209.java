package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168209 <code>a(n) = 5*n - a(n-1) + 1</code> with <code>n&gt;1, a(1)=3</code>.
 * @author Sean A. Irvine
 */
public class A168209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168209() {
    super(new long[] {-1, 1, 1}, new long[] {3, 8, 8});
  }
}
