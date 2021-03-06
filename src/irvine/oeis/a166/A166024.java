package irvine.oeis.a166;

import irvine.oeis.LinearRecurrence;

/**
 * A166024 Define <code>dsf(n) = A045503(n) = n_1^{n_1}+n_2^{n_2}+n_3^{n_3} + n_m^{n_m}</code>, where <code>{n_1,n_2,n_3,...n_m}</code> is the list of the decimal digits of n. <code>dsf(421845123) = 16780890</code> and <code>dsf(16780890) = 421845123</code>, so these 2 numbers make a loop for the function dsf.
 * @author Sean A. Irvine
 */
public class A166024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A166024() {
    super(new long[] {1, 0}, new long[] {421845123, 16780890});
  }
}
