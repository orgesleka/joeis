package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130129 <code>(3*n+1)*2^n</code>.
 * @author Sean A. Irvine
 */
public class A130129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130129() {
    super(new long[] {-4, 4}, new long[] {1, 8});
  }
}
