package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003988 Triangle with subscripts <code>(1,1),(2,1),(1,2),(3,1),(2,2),(1,3)</code>, etc. in which entry <code>(i,j)</code> is <code>[ i/j ]</code>.
 * @author Sean A. Irvine
 */
public class A003988 implements Sequence {

  private long mRow = 0;
  private long mCol = 0;

  @Override
  public Z next() {
    if (--mCol <= 0) {
      ++mRow;
      mCol = mRow;
    }
    return Z.valueOf(mCol / (mRow - mCol + 1));
  }
}
