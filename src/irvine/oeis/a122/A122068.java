package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122068 Expansion of <code>x*(1-3*x)*(1-x)/ (1-7*x+14*x^2-7*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A122068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122068() {
    super(new long[] {7, -14, 7}, new long[] {1, 3, 10});
  }
}
