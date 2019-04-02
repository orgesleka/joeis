package irvine.oeis.a002;

import irvine.math.graph.GraphUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002029 Number of connected graphs on n labeled nodes, each node being colored with one of 4 colors, such that no edge joins nodes of the same color.
 * @author Sean A. Irvine
 */
public class A002029 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return GraphUtils.numberConnectedLabelledColoured(++mN, 4);
  }

}
