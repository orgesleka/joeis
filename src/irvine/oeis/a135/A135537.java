package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135537 Period <code>4</code>: repeat <code>[7, 5, 2, 4]</code>.
 * @author Sean A. Irvine
 */
public class A135537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135537() {
    super(new long[] {1, -1, 1}, new long[] {7, 5, 2});
  }
}
