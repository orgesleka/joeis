package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066771 <code>5^n cos(2n arctan(1/2))</code> or denominator of <code>tan(2n arctan(1/2))</code>.
 * @author Sean A. Irvine
 */
public class A066771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066771() {
    super(new long[] {-25, 6}, new long[] {1, 3});
  }
}
