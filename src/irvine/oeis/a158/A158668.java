package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158668 <code>a(n) = 58*n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A158668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158668() {
    super(new long[] {1, -3, 3}, new long[] {57, 231, 521});
  }
}
