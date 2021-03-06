package irvine.oeis.a000;

import irvine.math.IntegerUtils;
import irvine.math.group.SymmetricGroup;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.partitions.IntegerPartition;

/**
 * A000595 Relations: number of nonisomorphic unlabeled binary relations on n labeled nodes.
 * @author Sean A. Irvine
 */
public class A000595 implements Sequence {

  protected int mN = -1;

  protected int t(final int[] j) {
    int sum = 0;
    for (int r = 0; r < j.length; ++r) {
      for (int s = 0; s < j.length; ++s) {
        sum += j[r] * j[s] * IntegerUtils.gcd(r, s);
      }
    }
    return sum;
  }

  protected Z zeroCase() {
    return Z.ONE;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return zeroCase();
    }
    final IntegerPartition ip = new IntegerPartition(mN);
    final int[] a = new int[mN + 1];
    Q s = Q.ZERO;
    int[] p;
    while ((p = ip.next()) != null) {
      IntegerPartition.toCountForm(p, a);
      s = s.add(new Q(Z.ONE.shiftLeft(t(a)), SymmetricGroup.per(a)));
    }
    return s.toZ();
  }
}
