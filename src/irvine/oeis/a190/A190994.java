package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190994 <code>a(0)=27, a(1)=2, a(n) = a(n-1) +a(n-2)</code> for <code>n&gt;=2</code>.
 * @author Sean A. Irvine
 */
public class A190994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190994() {
    super(new long[] {1, 1}, new long[] {27, 2});
  }
}
