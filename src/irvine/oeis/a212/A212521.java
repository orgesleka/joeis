package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212521 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>w&gt;=2x</code> and <code>y&lt;=3z</code>.
 * @author Sean A. Irvine
 */
public class A212521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212521() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 0, 4, 18, 60, 138, 297, 528, 912, 1440, 2200, 3180, 4536, 6174, 8330, 10920});
  }
}
