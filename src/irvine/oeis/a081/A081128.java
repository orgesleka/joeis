package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081128 <code>12th</code> binomial transform of <code>(0,1,0,0,0,0,0,0,...)</code>.
 * @author Sean A. Irvine
 */
public class A081128 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081128() {
    super(new long[] {-144, 24}, new long[] {0, 1});
  }
}
