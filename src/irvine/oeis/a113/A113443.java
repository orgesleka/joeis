package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113443 Fourth row of <code>A113439</code>.
 * @author Sean A. Irvine
 */
public class A113443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113443() {
    super(new long[] {1, -20, 38, -28, 9}, new long[] {1, 5, 23, 101, 436});
  }
}
