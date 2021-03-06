package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212963 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and <code>|w-x|!=|x-y|!=|y-z|</code>.
 * @author Sean A. Irvine
 */
public class A212963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212963() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 0, 0, 12, 36});
  }
}
