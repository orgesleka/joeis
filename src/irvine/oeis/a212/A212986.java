package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212986 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>2w = 3x+y</code>.
 * @author Sean A. Irvine
 */
public class A212986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212986() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {1, 1, 3, 5, 7, 10});
  }
}
