package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010122 Continued fraction for sqrt(13).
 * @author Sean A. Irvine
 */
public class A010122 extends PrependSequence {

  /** Construct the sequence. */
  public A010122() {
    super(new PeriodicSequence(1, 1, 1, 1, 6), Z.THREE);
  }
}

