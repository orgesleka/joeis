package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167011 Number of Level 1 hexagonal polyominoes with cheesy blocks and n cells.
 * @author Sean A. Irvine
 */
public class A167011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167011() {
    super(new long[] {1, 3, -13, 32, -27, 9}, new long[] {1, 3, 11, 44, 184, 784});
  }
}
