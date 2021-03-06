package irvine.oeis.a006;

import irvine.oeis.WittTransformSequence;
import irvine.oeis.a074.A074654;

/**
 * A006180 Witt vector <code>*5!/5!</code>.
 * @author Sean A. Irvine
 */
public class A006180 extends WittTransformSequence {

  /** Construct the sequence. */
  public A006180() {
    super(new A074654());
    next();
  }
}
