package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122884 The <code>(2,3)-entry</code> in the n-th power of the <code>3 X 3</code> matrix M <code>= [1,1,1; 4,2,1; 9,3,1]</code>.
 * @author Sean A. Irvine
 */
public class A122884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122884() {
    super(new long[] {-2, 11, 4}, new long[] {1, 7, 39});
  }
}
