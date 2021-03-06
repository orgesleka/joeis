package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212974 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>w&gt;floor((x+y)/3))</code>.
 * @author Sean A. Irvine
 */
public class A212974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212974() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {0, 4, 15, 37, 75, 132});
  }
}
