package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167817 Period <code>4</code>: repeat <code>[1, 3, 3, 3]</code>.
 * @author Sean A. Irvine
 */
public class A167817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167817() {
    super(new long[] {1, 0, 0, 0}, new long[] {1, 3, 3, 3});
  }
}
