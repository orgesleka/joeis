package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000026 Mosaic numbers or multiplicative projection of n: if <code>n =</code> Product <code>(p_j^k_j)</code> then <code>a(n) =</code> Product <code>(p_j * k_j)</code>.
 * @author Sean A. Irvine
 */
public class A000026 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z d : fs.toZArray()) {
      prod = prod.multiply(d).multiply(fs.getExponent(d));
    }
    return prod;
  }

}

