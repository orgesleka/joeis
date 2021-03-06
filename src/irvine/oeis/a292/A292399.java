package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292399 p-INVERT of <code>(1,2,3,5,8,...)</code> (distinct Fibonacci numbers), where <code>p(S) = (1 - S)^2</code>.
 * @author Sean A. Irvine
 */
public class A292399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292399() {
    super(new long[] {-4, -8, 0, 4}, new long[] {2, 7, 22, 69});
  }
}
