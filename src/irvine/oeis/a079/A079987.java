package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079987 Number of permutations satisfying <code>-k&lt;=p(i)-i&lt;=r</code> and <code>p(i)-i</code> not in I, <code>i=1..n</code>, with <code>k=3, r=3, I={-1,0,2}</code>.
 * @author Sean A. Irvine
 */
public class A079987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079987() {
    super(new long[] {-1, 2, -2, 1, -2, 0, 3, -6, 4, -5, 4, -2, -1, 4, -2, 3, -2, 2}, new long[] {1, 0, 0, 1, 2, 3, 5, 7, 15, 29, 49, 84, 149, 268, 484, 855, 1508, 2684});
  }
}
