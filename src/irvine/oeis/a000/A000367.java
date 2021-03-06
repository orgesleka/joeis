package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;
import irvine.oeis.Sequence;

/**
 * A000367 Numerators of Bernoulli numbers <code>B_2n</code>.
 * @author Sean A. Irvine
 */
public class A000367 implements Sequence {

  final BernoulliSequence mB = new BernoulliSequence(0);

  @Override
  public Z next() {
    final Z q = mB.nextQ().num();
    mB.nextQ();
    return q;
  }
}
