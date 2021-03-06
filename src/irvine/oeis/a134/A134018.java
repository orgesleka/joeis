package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134018 Let <code>P(A)</code> be the power set of an n-element set A. Then <code>a(n) =</code> the number of pairs of elements <code>{x,y}</code> of <code>P(A)</code> for which either <code>0) x</code> and y are disjoint and for which either x is a subset of y or y is a subset of x, or <code>1) x</code> and y are intersecting but for which x is not a subset of y and y is not a subset of x.
 * @author Sean A. Irvine
 */
public class A134018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134018() {
    super(new long[] {-24, 50, -35, 10}, new long[] {0, 1, 3, 10});
  }
}
