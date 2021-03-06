package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291024 p-INVERT of <code>(1,1,1,1,1,...)</code>, where <code>p(S) = (1 - 2 S^2)^2</code>.
 * @author Sean A. Irvine
 */
public class A291024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291024() {
    super(new long[] {-1, -4, -2, 4}, new long[] {0, 4, 8, 24});
  }
}
