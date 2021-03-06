package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010153 Continued fraction for <code>sqrt(75)</code> (or <code>5*sqrt(5))</code>.
 * @author Sean A. Irvine
 */
public class A010153 extends PrependSequence {

  /** Construct the sequence. */
  public A010153() {
    super(new PeriodicSequence(1, 1, 1, 16), Z.EIGHT);
  }
}

