package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062397 <code>a(n) = 10^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A062397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062397() {
    super(new long[] {-10, 11}, new long[] {2, 11});
  }
}
