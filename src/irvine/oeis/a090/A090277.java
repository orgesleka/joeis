package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090277 "Plain Bob Minimus" in bell-ringing is a sequence of permutations <code>p_1=(1,2,3,4), p_2=(2,1,4,3)</code>, .. which runs through all permutations of <code>{1,2,3,4}</code> with period 24; sequence gives number in position 1 of n-th permutation.
 * @author Sean A. Irvine
 */
public class A090277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090277() {
    super(new long[] {1, -1, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 1}, new long[] {1, 2, 2, 4, 4, 3, 3, 1, 1, 3, 3, 2, 2, 4, 4, 1, 1, 4, 4});
  }
}
