package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133141 Numbers which are both centered pentagonal <code>(A005891)</code> and centered hexagonal numbers <code>(A003215)</code>.
 * @author Sean A. Irvine
 */
public class A133141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133141() {
    super(new long[] {1, -483, 483}, new long[] {1, 331, 159391});
  }
}
