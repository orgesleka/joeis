package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212973 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>w&lt;=floor((x+y)/3))</code>.
 * @author Sean A. Irvine
 */
public class A212973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212973() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {1, 4, 12, 27, 50, 84});
  }
}
