package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081192 <code>10th</code> binomial transform of <code>(1,0,1,0,1,......), A059841</code>.
 * @author Sean A. Irvine
 */
public class A081192 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081192() {
    super(new long[] {-99, 20}, new long[] {1, 10});
  }
}
