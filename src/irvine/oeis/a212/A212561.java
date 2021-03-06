package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212561 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and w <code>+ x = 2y + 2z</code>.
 * @author Sean A. Irvine
 */
public class A212561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212561() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 0, 1, 5, 12, 26});
  }
}
