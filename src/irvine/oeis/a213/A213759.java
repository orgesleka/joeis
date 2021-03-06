package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213759 Principal diagonal of the convolution array <code>A213783</code>.
 * @author Sean A. Irvine
 */
public class A213759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213759() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 4, 11, 22, 39});
  }
}
