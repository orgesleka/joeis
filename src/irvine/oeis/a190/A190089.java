package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190089 Row sums of the triangular matrix <code>A190088</code>.
 * @author Sean A. Irvine
 */
public class A190089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190089() {
    super(new long[] {1, 2, 5}, new long[] {1, 4, 21});
  }
}
