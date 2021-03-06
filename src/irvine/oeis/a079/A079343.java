package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079343 Period <code>6</code>: repeat <code>[0, 1, 1, 2, 3, 1]</code>; also <code>F(n) mod 4</code>, where <code>F(n) = A000045(n)</code>.
 * @author Sean A. Irvine
 */
public class A079343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079343() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {0, 1, 1, 2, 3});
  }
}
