package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211541 Number of ordered triples <code>(w,x,y)</code> with all terms in <code>{1,...,n}</code> and <code>2w=3x-4y</code>.
 * @author Sean A. Irvine
 */
public class A211541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211541() {
    super(new long[] {1, 0, -1, -1, -1, 1, 1, 1, 0}, new long[] {0, 0, 1, 1, 3, 3, 6, 7, 11});
  }
}
