package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081628 <code>2*(-1)^n-(-5)^n</code>.
 * @author Sean A. Irvine
 */
public class A081628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081628() {
    super(new long[] {-5, -6}, new long[] {1, 3});
  }
}
