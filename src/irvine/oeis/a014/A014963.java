package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014963 Exponential of Mangoldt function <code>M(n): a(n) = 1</code> unless n is a prime or prime power when <code>a(n) =</code> that prime.
 * @author Sean A. Irvine
 */
public class A014963 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isProbablePrime()) {
      return mN;
    }
    final Z t = mN.isPower();
    return t == null || !t.isProbablePrime() ? Z.ONE : t;
  }
}
