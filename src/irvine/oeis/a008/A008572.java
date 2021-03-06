package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a001.A001021;

/**
 * A008572 Digits of powers of 12.
 * @author Sean A. Irvine
 */
public class A008572 extends A001021 {

  private String mA = "";
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mA.length()) {
      mA = super.next().toString();
      mM = 0;
    }
    return Z.valueOf(mA.charAt(mM) - '0');
  }
}
