package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016149 Expansion of <code>1/((1-4*x)*(1-6*x))</code>.
 * @author Sean A. Irvine
 */
public class A016149 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016149() {
    super(new long[] {-24, 10}, new long[] {1, 10});
  }
}
