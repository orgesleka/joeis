package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016791 <code>a(n) = (3n + 2)^3</code>.
 * @author Sean A. Irvine
 */
public class A016791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016791() {
    super(new long[] {-1, 4, -6, 4}, new long[] {8, 125, 512, 1331});
  }
}
