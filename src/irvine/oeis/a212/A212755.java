package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212755 Number of <code>(w,x,y,z)</code> with all terms in <code>{0,...,n}</code> and <code>|w-x|=max{w,x,y,z}-min{w,x,y,z}</code>.
 * @author Sean A. Irvine
 */
public class A212755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212755() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 10, 37, 96, 205});
  }
}
