package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a007.A007318;

/**
 * A014428 Even elements in Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A014428 extends A007318 {

  @Override
  public Z next() {
    while (true) {
      final Z b = super.next();
      if (b.isEven()) {
        return b;
      }
    }
  }
}
