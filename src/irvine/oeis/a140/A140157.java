package irvine.oeis.a140;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A140157 <code>a(1)=1, a(n) = a(n-1) + n^4</code> if n odd, <code>a(n) = a(n-1) + n^0</code> if n is even.
 * @author Georg Fischer
 */
public class A140157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140157() {
    super(new long[] {-1L, 1L, 5L, -5L, -10L, 10L, 10L, -10L, -5L, 5L, 1L}, new long[] {1L, 2L, 83L, 84L, 709L, 710L, 3111L, 3112L, 9673L, 9674L, 24315L});
  } // constructor()
} // A140157
