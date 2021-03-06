package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026039 <code>a(n) = (d(n) - r(n))/5</code>, where d <code>= A026037</code> and r is the periodic sequence with fundamental period <code>(1,2,0,2,0)</code>.
 * @author Sean A. Irvine
 */
public class A026039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026039() {
    super(new long[] {-1, 3, -3, 1, 0, 1, -3, 3}, new long[] {2, 4, 8, 13, 21, 31, 44, 61});
  }
}
