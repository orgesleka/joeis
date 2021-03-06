package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005715 Coefficient of <code>x^7</code> in expansion of <code>(1+x+x^2)^n</code>.
 * @author Sean A. Irvine
 */
public class A005715 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, 4).multiply(Z.valueOf(mN).add(27).multiply(mN).add(116).multiply(mN).subtract(120)).divide(210);
  }
}
