package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042650 Numerators of continued fraction convergents to <code>sqrt(855)</code>.
 * @author Sean A. Irvine
 */
public class A042650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042650() {
    super(new long[] {-1, 0, 0, 0, 6082, 0, 0, 0}, new long[] {29, 117, 731, 3041, 177109, 711477, 4445971, 18495361});
  }
}
