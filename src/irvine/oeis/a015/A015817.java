package irvine.oeis.a015;

import irvine.math.z.Z;

/**
 * A015817 Numbers n such that <code>phi(n + 1) | sigma(n)</code> for n congruent to <code>1 (mod 3)</code>.
 * @author Sean A. Irvine
 */
public class A015817 extends A015814 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(3) == 1) {
        return t;
      }
    }
  }
}
