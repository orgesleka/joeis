package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195316 Centered 36-gonal numbers.
 * @author Sean A. Irvine
 */
public class A195316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195316() {
    super(new long[] {1, -3, 3}, new long[] {1, 37, 109});
  }
}
