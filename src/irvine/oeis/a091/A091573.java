package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091573 Poincar&#233; series [or Poincare series] of the preprojective algebra of an extended Dynkin diagram of type <code>E_6</code>.
 * @author Sean A. Irvine
 */
public class A091573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091573() {
    super(new long[] {-1, 2, -2, 2}, new long[] {7, 12, 17, 24});
  }
}
