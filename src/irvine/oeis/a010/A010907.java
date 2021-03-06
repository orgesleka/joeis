package irvine.oeis.a010;

import irvine.oeis.PisotSequence;

/**
 * A010907 Pisot sequence <code>E(4,19), a(n) = floor( a(n-1)^2/a(n-2)+1/2 )</code>.
 * @author Sean A. Irvine
 */
public class A010907 extends PisotSequence {

  /** Construct the sequence. */
  public A010907() {
    super(4, 19);
  }
}

