package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212988 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>4*w = x+y</code>.
 * @author Sean A. Irvine
 */
public class A212988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212988() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {1, 1, 2, 4, 7, 9});
  }
}
