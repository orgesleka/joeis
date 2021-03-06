package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a002.A002251;

/**
 * A019444 <code>a_1, a_2</code>, ..., is a permutation of the positive integers such that the average of each initial segment is an integer, using the greedy algorithm to define <code>a_n</code>.
 * @author Sean A. Irvine
 */
public class A019444 extends A002251 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
