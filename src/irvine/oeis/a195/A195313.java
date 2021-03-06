package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195313 Generalized 13-gonal numbers: <code>m*(11*m-9)/2</code> with m <code>= 0, 1, -1, 2, -2, 3, -3</code>, ...
 * @author Sean A. Irvine
 */
public class A195313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195313() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 10, 13, 31});
  }
}
