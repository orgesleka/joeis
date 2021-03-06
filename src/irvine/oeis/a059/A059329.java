package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059329 Number of <code>3 X 3</code> matrices, with elements from <code>{0,...,n}</code>, having the property that the middle element of each of the eight 3-element horizontal, vertical and diagonal lines equals the average of the two end elements.
 * @author Sean A. Irvine
 */
public class A059329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059329() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 2, 7, 12, 25, 38});
  }
}
