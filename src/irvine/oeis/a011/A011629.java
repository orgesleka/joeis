package irvine.oeis.a011;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011629 Legendre symbol <code>(n,239)</code>.
 * @author Sean A. Irvine
 */
public class A011629 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.jacobi(++mN, 239));
  }
}
