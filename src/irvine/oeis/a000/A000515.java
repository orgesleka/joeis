package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000515 <code>a(n) = (2n)!(2n+1)!/n!^4</code>, or equally <code>(2n+1)C(2n,n)^2</code>.
 * @author Sean A. Irvine
 */
public class A000515 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN).square().multiply(2 * mN + 1);
  }
}
