package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006100 Gaussian binomial coefficient <code>[ n,2 ]</code> for <code>q=3</code>.
 * @author Sean A. Irvine
 */
public class A006100 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 2, 3);
  }
}
