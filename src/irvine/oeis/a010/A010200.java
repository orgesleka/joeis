package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010200 Continued fraction for <code>sqrt(141)</code>.
 * @author Sean A. Irvine
 */
public class A010200 extends PrependSequence {

  /** Construct the sequence. */
  public A010200() {
    super(new PeriodicSequence(1, 6, 1, 22), Z.valueOf(11));
  }
}

