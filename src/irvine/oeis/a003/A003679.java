package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000326;
import irvine.util.array.LongDynamicBooleanArray;

import java.util.ArrayList;
import java.util.List;

/**
 * A003679 Numbers that are not the sum of 3 pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A003679 implements Sequence {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private final List<Long> mPentagonals = new ArrayList<>();
  private final A000326 mPentagonalSource = new A000326();
  private long mLastPentagonal = -1;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN >= mLastPentagonal) {
        mLastPentagonal = mPentagonalSource.next().longValueExact();
        mPentagonals.add(mLastPentagonal);
        for (final long a : mPentagonals) {
          final long t = a + mLastPentagonal;
          for (final long b : mPentagonals) {
            mSeen.set(t + b);
          }
        }
      }
      if (!mSeen.isSet(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
