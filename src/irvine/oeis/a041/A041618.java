package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041618 Numerators of continued fraction convergents to <code>sqrt(328)</code>.
 * @author Sean A. Irvine
 */
public class A041618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041618() {
    super(new long[] {-1, 0, 326, 0}, new long[] {18, 163, 5886, 53137});
  }
}
