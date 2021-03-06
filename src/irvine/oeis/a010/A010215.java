package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010215 Continued fraction for <code>sqrt(167)</code>.
 * @author Sean A. Irvine
 */
public class A010215 extends PrependSequence {

  /** Construct the sequence. */
  public A010215() {
    super(new PeriodicSequence(1, 11, 1, 24), Z.valueOf(12));
  }
}

