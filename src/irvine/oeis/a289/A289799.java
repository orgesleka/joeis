package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289799 p-INVERT of <code>(n^3)</code>, where <code>p(S) = 1 - S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A289799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289799() {
    super(new long[] {-1, 9, -27, 55, -36, 55, -27, 9}, new long[] {1, 10, 62, 377, 2232, 13015, 75898, 444014});
  }
}
