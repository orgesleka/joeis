package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211542 Number of ordered triples <code>(w,x,y)</code> with all terms in <code>{1,...,n}</code> and <code>2w=4y-3x</code>.
 * @author Sean A. Irvine
 */
public class A211542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211542() {
    super(new long[] {1, 0, -1, -1, -1, 1, 1, 1, 0}, new long[] {0, 0, 1, 2, 3, 5, 8, 10, 14});
  }
}
