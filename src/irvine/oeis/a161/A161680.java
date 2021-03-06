package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161680 <code>a(n) = binomial(n,2)</code>: number of <code>size-2</code> subsets of <code>{0,1,...,n}</code> that contain no consecutive integers.
 * @author Sean A. Irvine
 */
public class A161680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161680() {
    super(new long[] {1, -3, 3}, new long[] {0, 0, 1});
  }
}
