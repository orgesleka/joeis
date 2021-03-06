package irvine.oeis.a014;

import irvine.oeis.RatPolyGfSequence;

/**
 * A014610 Tetranacci numbers arising in connection with current algebras <code>sp(2)_n</code>.
 * @author Sean A. Irvine
 */
public class A014610 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A014610() {
    super(new long[] {3, 2, 2, 1}, new long[] {1, -1, -1, -1, -1});
  }
}
