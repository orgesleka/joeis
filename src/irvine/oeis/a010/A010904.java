package irvine.oeis.a010;

import irvine.oeis.PisotSequence;

/**
 * A010904 Pisot sequence <code>E(4,14): a(n) = floor(a(n-1)^2/a(n-2)+1/2)</code> for <code>n&gt;1, a(0)=4, a(1)=14</code>.
 * @author Sean A. Irvine
 */
public class A010904 extends PisotSequence {

  /** Construct the sequence. */
  public A010904() {
    super(4, 14);
  }
}

