package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212971 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>w&lt;floor((x+y)/3))</code>.
 * @author Sean A. Irvine
 */
public class A212971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212971() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {0, 0, 3, 11, 25, 48});
  }
}
