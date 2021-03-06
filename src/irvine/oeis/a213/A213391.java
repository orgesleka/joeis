package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213391 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>2*max(w,x,y) &lt; 3*min(w,x,y)</code>.
 * @author Sean A. Irvine
 */
public class A213391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213391() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {0, 1, 2, 3, 10, 17, 24, 43});
  }
}
