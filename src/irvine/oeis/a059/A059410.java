package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059410 <code>J_n(9)</code> (see <code>A059379)</code>.
 * @author Sean A. Irvine
 */
public class A059410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059410() {
    super(new long[] {-27, 12}, new long[] {0, 6});
  }
}
