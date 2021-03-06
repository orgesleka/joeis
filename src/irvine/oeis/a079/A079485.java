package irvine.oeis.a079;

import chesspresso.position.Position;
import irvine.oeis.a048.A048987;

/**
 * A079485 Number of chess games that end in checkmate after exactly n plies.
 * @author Sean A. Irvine
 */
public class A079485 extends A048987 {

  @Override
  protected boolean accept(final Position position) {
    return position.isMate();
  }
}

