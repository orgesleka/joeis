package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029697 Number of words of length <code>2n</code> in the 6 transpositions of <code>S[ 4 ]</code> equivalent to the identity.
 * @author Sean A. Irvine
 */
public class A029697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029697() {
    super(new long[] {-144, 40}, new long[] {6, 120});
  }
}
