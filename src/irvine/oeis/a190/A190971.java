package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190971 <code>a(n) = 5*a(n-1) - 10*a(n-2)</code>, with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A190971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190971() {
    super(new long[] {-10, 5}, new long[] {0, 1});
  }
}
