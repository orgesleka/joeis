package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052541 Expansion of <code>1/(1-3x-x^3)</code>.
 * @author Sean A. Irvine
 */
public class A052541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052541() {
    super(new long[] {1, 0, 3}, new long[] {1, 3, 9});
  }
}
