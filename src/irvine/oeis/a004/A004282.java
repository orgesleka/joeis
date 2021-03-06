package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004282 <code>a(n) = n*(n+1)^2*(n+2)^2/12</code>.
 * @author Sean A. Irvine
 */
public class A004282 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1).square()).multiply(mN.add(2).square()).divide(12);
  }
}
