package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212989 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>4*w = 4*x+y</code>.
 * @author Sean A. Irvine
 */
public class A212989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212989() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {1, 2, 3, 4, 9, 11, 13, 15, 24});
  }
}
