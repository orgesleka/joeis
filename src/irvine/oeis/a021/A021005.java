package irvine.oeis.a021;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a037.A037074;

/**
 * A021005.
 * @author Sean A. Irvine
 */
public class A021005 extends A037074 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private int mN = -1;

  private Z get(final int n) {
    while (n >= mA.size()) {
      mA.add(super.next());
    }
    return mA.get(n);
  }

  @Override
  public Z next() {
    while (true) {
      final Z q2 = get(++mN).square();
      boolean ok = true;
      for (int k = 1; k <= mN; ++k) {
        final Z v2 = get(mN - k).multiply(get(mN + k));
        if (q2.compareTo(v2) <= 0) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return get(mN).sqrt();
      }
    }
  }
}

