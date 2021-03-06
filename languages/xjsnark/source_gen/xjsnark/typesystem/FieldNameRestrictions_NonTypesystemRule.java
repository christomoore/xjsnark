package xjsnark.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class FieldNameRestrictions_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public FieldNameRestrictions_NonTypesystemRule() {
  }
  public void applyRule(final SNode fieldDeclaration, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {

    if (SPropertyOperations.getString(fieldDeclaration, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) == null) {
      return;
    }
    if (SPropertyOperations.getString(fieldDeclaration, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).startsWith("__") && ListSequence.fromList(SNodeOperations.getNodeAncestors(fieldDeclaration, null, false)).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x64cb8fa51401373bL, "xjsnark.structure.ProgramDefinition")) || SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x701def9dcb9d54fcL, "xjsnark.structure.StructDefinition")) || SNodeOperations.isInstanceOf(it, MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x5dcbcfcfec8805fcL, "xjsnark.structure.RuntimeStructDefinition"));
      }
    })) {

      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(fieldDeclaration, "Names that start with \"__\" are reserved for xjsnark", "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "7495353643723799206", null, errorTarget);
      }
    }
    if (!(KeywordChecker.checkAgainstKeywords(SPropertyOperations.getString(fieldDeclaration, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"))))) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(fieldDeclaration, "Reserved Keyword/Prefix", "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "7495353643725832374", null, errorTarget);
      }
    }
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c108ca68L, "jetbrains.mps.baseLanguage.structure.FieldDeclaration");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return true;
  }
}
