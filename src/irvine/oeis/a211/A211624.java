package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211624 Number of ordered triples <code>(w,x,y)</code> with all terms in <code>{-n,...-1,1,...,n}</code> and <code>w+2x+2y&gt;0</code>.
 * @author Sean A. Irvine
 */
public class A211624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211624() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 4, 30, 104, 245, 485});
  }
}
