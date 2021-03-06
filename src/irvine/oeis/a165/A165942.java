package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165942 For a nonnegative integer n, define <code>dsf(n) = n_1^{n_1}+n_2^{n_2}+n_3^{n_3} + n_m^{n_m}</code>, where <code>{n_1,n_2,n_3,...n_m}</code> is the list of the digits of an integer n. Then <code>a(n+1) = dsf(a(n))</code>.
 * @author Sean A. Irvine
 */
public class A165942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165942() {
    super(new long[] {1, 0, 0}, new long[] {3418, 16777500, 2520413});
  }
}
