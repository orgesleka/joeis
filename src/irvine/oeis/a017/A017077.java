package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017077 <code>a(n) = 8*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A017077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017077() {
    super(new long[] {-1, 2}, new long[] {1, 9});
  }
}
