package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024091 <code>a(n) = 8^n - n^3</code>.
 * @author Sean A. Irvine
 */
public class A024091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024091() {
    super(new long[] {8, -33, 52, -38, 12}, new long[] {1, 7, 56, 485, 4032});
  }
}
