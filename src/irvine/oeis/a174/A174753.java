package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174753 x-values in the solution to x^2-43*y^2=1.
 * @author Sean A. Irvine
 */
public class A174753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174753() {
    super(new long[] {-1, 6964}, new long[] {1, 3482});
  }
}
