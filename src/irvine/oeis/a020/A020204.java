package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020204 Pseudoprimes to base 76.
 * @author Sean A. Irvine
 */
public class A020204 implements Sequence {

  private static final Z BASE = Z.valueOf(76);
  private Z mN = Z.valueOf(13);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (BASE.modPow(mN.subtract(1), mN).equals(Z.ONE) && !mN.isPrime()) {
        return mN;
      }
    }
  }
}
