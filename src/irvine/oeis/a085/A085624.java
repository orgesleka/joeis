package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085624 Sum of the entries in the character table of the dihedral group <code>D_{2n}</code> of order <code>2n</code>.
 * @author Sean A. Irvine
 */
public class A085624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085624() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 4, 5, 8, 8});
  }
}
