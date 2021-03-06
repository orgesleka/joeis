package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186731 <code>a(3n) = 2n, a(3n+1) =</code> n, <code>a(3n+2) = n+1</code>.
 * @author Sean A. Irvine
 */
public class A186731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186731() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 0, 1, 2, 1, 2});
  }
}
