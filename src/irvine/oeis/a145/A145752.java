package irvine.oeis.a145;

import irvine.math.group.AlternatingGroup;
import irvine.math.group.IntegersMod;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A145752 <code>a(n) =</code> number of elements of order n in simple group <code>Alt(7)</code> of order 2520.
 * @author Sean A. Irvine
 */
public class A145752 extends OrdersFiniteGroupSequence {

  /** Construct the sequence. */
  public A145752() {
    super(new AlternatingGroup<>(new IntegersMod(7)));
  }
}
