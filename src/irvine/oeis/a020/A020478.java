package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020478 Number of singular <code>2 X 2</code> matrices over <code>Z(n) (i.e.</code>, with determinant <code>= 0)</code>.
 * @author Sean A. Irvine
 */
public class A020478 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z a = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final Z b = p.pow(e);
      a = a.multiply(p.pow(2 * e - 1).multiply(b.multiply(p).add(b).subtract(1)));
    }
    return a;
  }
}
