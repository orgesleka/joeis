package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080960 Third binomial transform of <code>A010685</code> (period <code>2</code>: repeat <code>1,4)</code>.
 * @author Sean A. Irvine
 */
public class A080960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080960() {
    super(new long[] {-8, 6}, new long[] {1, 7});
  }
}
