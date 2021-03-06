package irvine.oeis.a004;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A004979 <code>a(n)=least</code> number m such that <code>m-a(n-1)&lt;&gt;a(j)-a(k)</code> for all j,k less than m; <code>a(1)=1, a(2)=3</code>.
 * @author Sean A. Irvine
 */
public class A004979 extends MemorySequence {

  private Z mPrev = null;
  private final Set<Z> mSeenDiff = new HashSet<>();

  @Override
  protected Z computeNext() {
    if (mPrev == null) {
      mPrev = Z.ONE;
    } else if (Z.ONE.equals(mPrev)) {
      mPrev = Z.THREE;
      mSeenDiff.add(Z.TWO);
    } else {
      Z m = Z.ZERO;
      while (true) {
        m = m.add(1);
        if (!mSeenDiff.contains(m)) {
          mPrev = mPrev.add(m);
          for (final Z a : this) {
            mSeenDiff.add(mPrev.subtract(a));
          }
          break;
        }
      }
    }
    return mPrev;
  }

}
