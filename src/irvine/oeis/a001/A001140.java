package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001140 Describe the previous <code>term!</code> (method <code>A -</code> initial term is <code>4)</code>.
 * @author Sean A. Irvine
 */
public class A001140 implements Sequence {

  private Z mPrev = null;

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.FOUR : ZUtils.describe(mPrev);
    return mPrev;
  }
}
