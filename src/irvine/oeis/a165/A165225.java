package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165225 <code>a(0)=1, a(1)=5, a(n)=10*a(n-1)-5*a(n-2)</code> for <code>n&gt;1 </code>.
 * @author Sean A. Irvine
 */
public class A165225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165225() {
    super(new long[] {-5, 10}, new long[] {1, 5});
  }
}
