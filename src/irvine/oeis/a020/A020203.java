package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020203 Pseudoprimes to base 75.
 * @author Sean A. Irvine
 */
public class A020203 implements Sequence {

  private static final Z BASE = Z.valueOf(75);
  private Z mN = Z.valueOf(73);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (BASE.modPow(mN.subtract(1), mN).equals(Z.ONE) && !mN.isPrime()) {
        return mN;
      }
    }
  }
}
