package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153497 <code>a(n)</code> is the number whose binary expansion is <code>A153498(n)</code>.
 * @author Sean A. Irvine
 */
public class A153497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153497() {
    super(new long[] {-64, 80, -56, 50, -14, 5}, new long[] {1, 7, 21, 73, 341, 1453});
  }
}
