package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040864 Continued fraction for <code>sqrt(894)</code>.
 * @author Georg Fischer
 */
public class A040864 extends PrependSequence {

  /** Construct the sequence. */
  public A040864() {
    super(new PeriodicSequence(1, 8, 1, 58), Z.valueOf(29));
  }
}
