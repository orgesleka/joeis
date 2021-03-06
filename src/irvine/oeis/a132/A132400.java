package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132400 Period <code>4</code>: repeat <code>[1, 5, 3, 1]</code>.
 * @author Sean A. Irvine
 */
public class A132400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132400() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 5, 3, 1});
  }
}
