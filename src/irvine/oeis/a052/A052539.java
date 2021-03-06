package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052539 <code>a(n) = 4^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A052539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052539() {
    super(new long[] {-4, 5}, new long[] {2, 5});
  }
}
