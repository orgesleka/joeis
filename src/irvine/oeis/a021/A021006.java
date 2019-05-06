package irvine.oeis.a021;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A021006.
 * @author Sean A. Irvine
 */
public class A021006 extends PisotLSequence {

  /** Construct the sequence. */
  public A021006() {
    super(4, 11, Q.HALF.negate());
  }
}

