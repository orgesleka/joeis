package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211539 Number of ordered triples <code>(w,x,y)</code> with all terms in <code>{1,...,n}</code> and <code>2w = 2n - 2x +</code> y.
 * @author Sean A. Irvine
 */
public class A211539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211539() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 0, 2, 3, 7});
  }
}
