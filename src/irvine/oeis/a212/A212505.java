package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212505 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>w&lt;2x</code> and <code>y&gt;=2z</code>.
 * @author Sean A. Irvine
 */
public class A212505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212505() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 0, 3, 14, 48, 114, 243, 444});
  }
}
