package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173259 Period <code>3</code>: repeat <code>[4, 1, 4]</code>.
 * @author Sean A. Irvine
 */
public class A173259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173259() {
    super(new long[] {1, 0, 0}, new long[] {4, 1, 4});
  }
}
