package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233139 Number of tilings of a <code>4 X n</code> rectangle using T and Z tetrominoes.
 * @author Sean A. Irvine
 */
public class A233139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233139() {
    super(new long[] {2, 1, 0, 2}, new long[] {1, 0, 0, 0});
  }
}
