package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254711 Pentagonal numbers <code>(A000326)</code> which are also centered square numbers <code>(A001844)</code>.
 * @author Sean A. Irvine
 */
public class A254711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254711() {
    super(new long[] {1, -1, -194, 194, 1}, new long[] {1, 5, 145, 925, 28085});
  }
}
