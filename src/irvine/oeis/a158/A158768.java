package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158768 <code>a(n) = 1521*n^2 + 39</code>.
 * @author Sean A. Irvine
 */
public class A158768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158768() {
    super(new long[] {1, -3, 3}, new long[] {39, 1560, 6123});
  }
}
