package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141023 <code>a(n) = 2^n - (3-(-1)^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A141023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141023() {
    super(new long[] {-2, 1, 2}, new long[] {0, 0, 3});
  }
}
