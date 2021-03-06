package irvine.oeis.a305;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A305381 Number of <code>1</code>'s in truth table for Boolean function <code>x1 x2 x4 + x2 x3 x5 +</code> ... <code>+ x{n-3} x{n-2} xn + x{n-2} x{n-1} x1 + x{n-1} xn x2 + xn x1 x3</code>.
 * @author Georg Fischer
 */
public class A305381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A305381() {
    super(new long[] {-8L, 4L, 0L, -4L, 2L, 2L}, new long[] {4L, 6L, 24L, 36L, 112L, 184L});
  } // constructor()
} // A305381
