package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079816 Number of permutations satisfying <code>-k&lt;=p(i)-i&lt;=r</code> and <code>p(i)-i</code> not in I, <code>i=1..n</code>, with <code>k=1, r=5, I={1}</code>.
 * @author Sean A. Irvine
 */
public class A079816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079816() {
    super(new long[] {1, 1, 1, 1, 0, 1}, new long[] {1, 1, 1, 2, 4, 7});
  }
}
