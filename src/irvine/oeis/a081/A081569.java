package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081569 Fourth binomial transform of <code>F(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A081569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081569() {
    super(new long[] {-19, 9}, new long[] {1, 5});
  }
}
