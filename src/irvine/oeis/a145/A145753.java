package irvine.oeis.a145;

import irvine.math.group.AlternatingGroup;
import irvine.math.group.IntegersMod;
import irvine.oeis.OrdersFiniteGroupSequence;

/**
 * A145753 <code>a(n) =</code> number of elements of order n in simple group <code>Alt(8)</code> of order 20160.
 * @author Sean A. Irvine
 */
public class A145753 extends OrdersFiniteGroupSequence {

  /** Construct the sequence. */
  public A145753() {
    super(new AlternatingGroup<>(new IntegersMod(8)));
  }
}
