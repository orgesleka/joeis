package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071253 <code>n^2*(n^2+1)</code>.
 * @author Sean A. Irvine
 */
public class A071253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071253() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 2, 20, 90, 272});
  }
}
