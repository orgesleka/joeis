package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271800 Five steps forward, four steps back.
 * @author Sean A. Irvine
 */
public class A271800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271800() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 4, 3, 2, 1});
  }
}
