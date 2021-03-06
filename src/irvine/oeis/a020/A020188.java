package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020188 Pseudoprimes to base 60.
 * @author Sean A. Irvine
 */
public class A020188 implements Sequence {

  private static final Z BASE = Z.valueOf(60);
  private Z mN = Z.valueOf(339);

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
