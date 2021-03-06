package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112132 Period <code>4</code>: repeat <code>[1, 3, 1, 7]</code>.
 * @author Sean A. Irvine
 */
public class A112132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112132() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 3, 1, 7});
  }
}
