package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.StanleySequence;

/**
 * A005487 Starts <code>0, 4</code> and contains no 3-term arithmetic progression.
 * @author Sean A. Irvine
 */
public class A005487 extends StanleySequence {

  /** Construct the sequence. */
  public A005487() {
    super(Z.ZERO, Z.FOUR);
  }
}
