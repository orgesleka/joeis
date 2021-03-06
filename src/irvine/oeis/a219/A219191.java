package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219191 Numbers of the form <code>k*(7*k+1)</code>, where k <code>= 0,-1,1,-2,2,-3,3,..</code>.
 * @author Sean A. Irvine
 */
public class A219191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219191() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 6, 8, 26, 30});
  }
}
