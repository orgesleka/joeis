package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097789 <code>a(n)=4a(n-1)+C(n+4,4),n&gt;0, a(0)=1</code>.
 * @author Sean A. Irvine
 */
public class A097789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097789() {
    super(new long[] {-4, 21, -45, 50, -30, 9}, new long[] {1, 9, 51, 239, 1026, 4230});
  }
}
