package irvine.oeis.a009;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009194 <code>a(n) = gcd(n, sigma(n))</code>.
 * @author Sean A. Irvine
 */
public class A009194 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.gcd(Cheetah.factor(mN).sigma());
  }
}
