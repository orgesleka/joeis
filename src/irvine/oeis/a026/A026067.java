package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026067 <code>a(n) = (d(n)-r(n))/2</code>, where d <code>= A026066</code> and r is the periodic sequence with fundamental period <code>(1,0,0,0)</code>.
 * @author Sean A. Irvine
 */
public class A026067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026067() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {52, 84, 123, 170, 225, 290, 364});
  }
}
