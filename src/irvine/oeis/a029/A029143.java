package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029143 Expansion of <code>1/((1-x^2)*(1-x^3)*(1-x^5)*(1-x^6))</code>. Molien series for u.g.g.r. <code>#31</code> of order 46080. Poincar&#233; series [or Poincare series] for ring of even weight Siegel modular forms of genus 2.
 * @author Sean A. Irvine
 */
public class A029143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029143() {
    super(new long[] {-1, 0, 1, 1, 0, 0, 1, -1, -2, -1, 1, 0, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 2, 3, 2, 4, 4, 5, 6, 8, 7, 10, 11});
  }
}
