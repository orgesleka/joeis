package irvine.oeis.a079;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A079675 <code>a(1)=1; a(n)=sum(u=1,n-1,sum(v=1,u,sum(w=1,v,sum(x=1, w,sum(y=1,x,a(y))))))</code>.
 * @author Georg Fischer
 */
public class A079675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079675() {
    super(new long[] {1L, -5L, 10L, -10L, 6L}, new long[] {1L, 6L, 26L, 106L, 431L}, new long[] {1L});
  } // constructor()
} // A079675
