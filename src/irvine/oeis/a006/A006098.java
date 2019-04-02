package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006098 Gaussian binomial coefficient [ 2n,n ] for q=2.
 * @author Sean A. Irvine
 */
public class A006098 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(2 * ++mN, mN, 2);
  }
}
