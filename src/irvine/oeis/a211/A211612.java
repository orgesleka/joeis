package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211612 Number of ordered triples <code>(w,x,y)</code> with all terms in <code>{-n,...-1,1,...,n}</code> and <code>w+x+y&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A211612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211612() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 4, 35, 117});
  }
}
