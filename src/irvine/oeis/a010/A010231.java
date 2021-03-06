package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010231 Continued fraction for <code>sqrt(189)</code>.
 * @author Sean A. Irvine
 */
public class A010231 extends PrependSequence {

  /** Construct the sequence. */
  public A010231() {
    super(new PeriodicSequence(1, 2, 1, 26), Z.valueOf(13));
  }
}

