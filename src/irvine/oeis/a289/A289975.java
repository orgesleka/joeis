package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289975 p-INVERT of the Fibonacci numbers <code>(A000045</code>, including <code>0)</code>, where <code>p(S) = 1 - S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A289975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289975() {
    super(new long[] {-1, -3, 2, 2}, new long[] {0, 1, 1, 4});
  }
}
