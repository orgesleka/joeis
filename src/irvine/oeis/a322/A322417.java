package irvine.oeis.a322;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A322417 <code>a(n) - 2*a(n-1) =</code> period <code>2</code>: repeat <code>[3, 0]</code> for <code>n &gt; 0, a(0)=5, a(1)=13</code>.
 * @author Georg Fischer
 */
public class A322417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A322417() {
    super(new long[] {-2L, 1L, 2L}, new long[] {5L, 13L, 26L});
  } // constructor()
} // A322417
