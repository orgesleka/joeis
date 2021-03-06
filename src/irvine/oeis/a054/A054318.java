package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054318 <code>a(n)-th</code> star number <code>(A003154)</code> is a square.
 * @author Sean A. Irvine
 */
public class A054318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054318() {
    super(new long[] {1, -11, 11}, new long[] {1, 5, 45});
  }
}
