package constraintBenchTestSuite;

import com.microsoft.z3.BoolExpr;

import org.junit.Assert;
import org.junit.Test;

import cova.core.SMTSolverZ3;
import cova.data.ConstraintZ3;
import utils.ConstraintBenchTestFramework;

/**
 * 
 */
public class Infeasible2Test extends ConstraintBenchTestFramework {

  public Infeasible2Test() {
    targetTestClassName = "constraintBench.test.infeasible.Infeasible2";
  }

  @Test
  public void test() {
    BoolExpr termA = SMTSolverZ3.getInstance().makeBoolTerm(A, false);
    BoolExpr FALSE = SMTSolverZ3.getInstance().getFalse();
    BoolExpr actual = ((ConstraintZ3) results.get(14)).getExpr();
    boolean equivalent = SMTSolverZ3.getInstance().prove(termA, actual);
    Assert.assertTrue(equivalent);

    actual = ((ConstraintZ3) results.get(19)).getExpr();
    equivalent = SMTSolverZ3.getInstance().prove(termA, actual);
    Assert.assertTrue(equivalent);

    actual = ((ConstraintZ3) results.get(20)).getExpr();
    equivalent = SMTSolverZ3.getInstance().prove(termA, actual);
    Assert.assertTrue(equivalent);

    actual = ((ConstraintZ3) results.get(21)).getExpr();
    equivalent = SMTSolverZ3.getInstance().prove(FALSE, actual);
    Assert.assertTrue(equivalent);
  }
}
