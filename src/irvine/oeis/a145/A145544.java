package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145544 <code>4*(4^n-3^n)</code>.
 * @author Sean A. Irvine
 */
public class A145544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145544() {
    super(new long[] {-12, 7}, new long[] {0, 4});
  }
}
