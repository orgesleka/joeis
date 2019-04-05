package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040397 Continued fraction for sqrt(418).
 * @author Georg Fischer
 */
public class A040397 extends PrependSequence {

  /** Construct the sequence. */
  public A040397() {
    super(new PeriodicSequence(2, 4, 20, 4, 2, 40), Z.valueOf(20));
  }
}
