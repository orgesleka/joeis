package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026937 <code>a(n) = Sum_{k=0..n} (k+1)*T(n,n-k)</code>, where T is given by <code>A008288</code>.
 * @author Sean A. Irvine
 */
public class A026937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026937() {
    super(new long[] {-1, -4, -2, 4}, new long[] {1, 3, 10, 30});
  }
}
