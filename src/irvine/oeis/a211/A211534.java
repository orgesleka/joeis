package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211534 Number of ordered triples <code>(w,x,y)</code> with all terms in <code>{1,...,n}</code> and w <code>= 3x + 3y</code>.
 * @author Sean A. Irvine
 */
public class A211534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211534() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {0, 0, 0, 0, 0, 0, 1});
  }
}
