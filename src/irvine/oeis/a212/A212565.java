package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212565 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>w+x&gt;=2y+2z</code>.
 * @author Sean A. Irvine
 */
public class A212565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212565() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 0, 1, 8, 28, 74, 159});
  }
}
