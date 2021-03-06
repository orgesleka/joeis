package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A001285 Thue-Morse sequence: let <code>A_k</code> denote the first <code>2^k</code> terms; then <code>A_0 = 1</code> and for k <code>&gt;= 0, A_{k+1} = A_k B_k</code>, where <code>B_k</code> is obtained from <code>A_k</code> by interchanging <code>1</code>'s and <code>2</code>'s.
 * @author Sean A. Irvine
 */
public class A001285 implements Sequence {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mA.set(0, (byte) 1);
      return Z.ONE;
    }
    final byte b = (mN & 1) == 0 ? mA.get(mN >>> 1) : (byte) (3 - mA.get(mN >>> 1));
    mA.set(mN, b);
    return Z.valueOf(b);
  }

}
