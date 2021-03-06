package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026041 <code>a(n) = d(n)/2</code>, where d <code>= A026040</code>.
 * @author Sean A. Irvine
 */
public class A026041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026041() {
    super(new long[] {-1, 4, -6, 4}, new long[] {12, 20, 32, 49});
  }
}
