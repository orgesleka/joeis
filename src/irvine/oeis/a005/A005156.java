package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005156 Number of alternating sign <code>2n+1 X 2n+1</code> matrices symmetric about the vertical axis <code>(VSASM's)</code>; also <code>2n X 2n off-diagonally</code> symmetric alternating sign matrices <code>(OSASM's)</code>.
 * @author Sean A. Irvine
 */
public class A005156 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q p = new Q(-3).pow(mN * mN);
    for (int i = 1; i <= 2 * mN + 1; ++i) {
      for (int j = 1; j <= mN; ++j) {
        p = p.multiply(6 * j - 3 * i + 1).divide(2 * j - i + 2 * mN + 1);
      }
    }
    return p.toZ();
  }
}

