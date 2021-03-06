package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253654 Indices of pentagonal numbers <code>(A000326)</code> which are also centered pentagonal numbers <code>(A005891)</code>.
 * @author Sean A. Irvine
 */
public class A253654 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253654() {
    super(new long[] {1, -9, 9}, new long[] {1, 6, 46});
  }
}
