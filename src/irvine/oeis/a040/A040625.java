package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040625 Continued fraction for sqrt(651).
 * @author Georg Fischer
 */
public class A040625 extends PrependSequence {

  /** Construct the sequence. */
  public A040625() {
    super(new PeriodicSequence(1, 1, 16, 1, 1, 50), Z.valueOf(25));
  }
}
