package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;
import irvine.oeis.PrependSequence;

/**
 * A018840 Number of steps for <code>{2,3}</code> fairy knight to reach <code>(n,0)</code> on infinite chessboard.
 * @author Sean A. Irvine
 */
public class A018840 extends PrependSequence {

  /** Construct the sequence. */
  public A018840() {
    super(new LinearRecurrence(new long[] {-1, 1, 0, 0, 0, 0, 1},
        new long[] {4, 5, 6, 7, 6, 7, 6}),
      0, 5, 4, 5, 2, 5, 2, 5, 4, 5, 4, 7);
  }
}
