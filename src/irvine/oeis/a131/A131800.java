package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131800 Period <code>4</code>: repeat <code>[1, 2, 5, 6]</code>.
 * @author Sean A. Irvine
 */
public class A131800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131800() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 2, 5, 6});
  }
}
