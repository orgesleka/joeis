package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212987 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>3*w = 2*x+2*y</code>.
 * @author Sean A. Irvine
 */
public class A212987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212987() {
    super(new long[] {1, 0, -2, -1, 1, 2, 0}, new long[] {1, 1, 3, 5, 8, 10, 16});
  }
}
