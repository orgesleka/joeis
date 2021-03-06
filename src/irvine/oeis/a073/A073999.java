package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073999 Number of strings of length n over <code>GF(4)</code> with trace 1 and subtrace x where <code>x = RootOf(z^2+z+1)</code>.
 * @author Sean A. Irvine
 */
public class A073999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073999() {
    super(new long[] {-32, 24, -12, 6}, new long[] {0, 0, 3, 16});
  }
}
