package irvine.oeis.a002;

import irvine.oeis.PeriodicSequence;
import irvine.oeis.EulerTransformSequence;

/**
 * A002507 Expansion of a modular function for <code>Gamma_0(6)</code>.
 * @author Sean A. Irvine
 */
public class A002507 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A002507() {
    super(new PeriodicSequence(2, -8, -12, -8, 2, 0), 0);
  }
}
