package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212508 Number of <code>(w,x,y,z)</code> with all terms in <code>{1,...,n}</code> and <code>w&lt;2x</code> and <code>y&lt;3z</code>.
 * @author Sean A. Irvine
 */
public class A212508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212508() {
    super(new long[] {1, 0, -2, -2, 1, 4, 0, -2, 0, 2, 0, -4, -1, 2, 2, 0}, new long[] {0, 1, 12, 56, 168, 418, 837, 1554, 2640, 4209, 6375, 9373, 13176, 18161, 24402, 32110});
  }
}
