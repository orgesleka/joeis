package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081704 Let <code>f(0)=1, f(1)=t, f(n+1) = (f(n)^2+t^n)/f(n-1). f(t)</code> is a polynomial with integer coefficients. Then <code>a(n) = f(n)</code> when <code>t=3</code>.
 * @author Sean A. Irvine
 */
public class A081704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081704() {
    super(new long[] {-3, 5}, new long[] {1, 3});
  }
}
