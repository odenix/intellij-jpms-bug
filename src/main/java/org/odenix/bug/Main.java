package org.odenix.bug;

import com.oracle.truffle.api.dsl.Specialization;

public class Main {
  @Specialization
  Object foo() { return 42; }
}
