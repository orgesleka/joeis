package irvine.oeis.a017;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017125.
 * @author Sean A. Irvine
 */
public class A017125 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mM, mN - mM);
  }

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m <= 1) {
      return m == 1 ? Z.ONE : Z.valueOf(n);
    }
    return get(n, m - 1).add(get(n, m - 2));
  }
}
