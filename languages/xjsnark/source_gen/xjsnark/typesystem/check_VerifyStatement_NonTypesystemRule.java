package xjsnark.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_VerifyStatement_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_VerifyStatement_NonTypesystemRule() {
  }
  public void applyRule(final SNode verifyStatement, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(verifyStatement, MetaAdapterFactory.getContainmentLink(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c116dbe1L, 0x68d52c08c116fc7fL, "condition"))), _quotation_createNode_i313ax_b0a0a1(), false)) {
    } else {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(verifyStatement, "Verify only accepts Xjsnark Boolean type", "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "7553992366101079000", null, errorTarget);
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x68d52c08c116dbe1L, "xjsnark.structure.VerifyStatement");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
  private static SNode _quotation_createNode_i313ax_b0a0a1() {
    PersistenceFacade facade = PersistenceFacade.getInstance();
    SNode quotedNode_1 = null;
    quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration(MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x57892321212d3cd7L, "xjsnark.structure.JBooleanType"), null, null, false);
    return quotedNode_1;
  }
}
