package irvine.oeis.a010;

import irvine.oeis.PisotSequence;

/**
 * A010911 Pisot sequence <code>E(3,11), a(n)=[ a(n-1)^2/a(n-2)+1/2 ]</code>.
 * @author Sean A. Irvine
 */
public class A010911 extends PisotSequence {

  /** Construct the sequence. */
  public A010911() {
    super(3, 11);
  }
}

