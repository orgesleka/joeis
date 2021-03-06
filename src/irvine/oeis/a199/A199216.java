package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199216 <code>6*5^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199216() {
    super(new long[] {-5, 6}, new long[] {7, 31});
  }
}
