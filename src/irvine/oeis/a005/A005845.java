package irvine.oeis.a005;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005845 Bruckman-Lucas pseudoprimes: <code>n | (L_n - 1)</code>, where n is composite and <code>L_n =</code> Lucas numbers <code>A000032</code>.
 * @author Sean A. Irvine
 */
public class A005845 implements Sequence {

  private Z mN = Z.valueOf(704);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z lucas = Fibonacci.lucas(mN.intValueExact());
      if (!mN.isProbablePrime(30) && Z.ONE.equals(lucas.mod(mN))) {
        return mN;
      }
    }
  }
}
