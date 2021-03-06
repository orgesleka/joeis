package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052923 Expansion of <code>(1-x)/(1-x-4x^2)</code>.
 * @author Sean A. Irvine
 */
public class A052923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052923() {
    super(new long[] {4, 1}, new long[] {1, 0});
  }
}
