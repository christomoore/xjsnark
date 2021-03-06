package xjsnark.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import xjsnark.behavior.JUnsignedBigIntegerLiteral__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.typesystem.inference.EquationInfo;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class typeof_JUnsignedBigIntegerLiteral_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_JUnsignedBigIntegerLiteral_InferenceRule() {
  }
  public void applyRule(final SNode jUnsignedBigIntegerLiteral, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {


    SNode node = SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, "xjsnark.structure.JUnsignedIntegerType")));
    int actualBitwidth = JUnsignedBigIntegerLiteral__BehaviorDescriptor.getValue_id7NY5omJbF64.invoke(jUnsignedBigIntegerLiteral).bitLength();
    SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x39ce7332e3fe6a0eL, 0x39ce7332e3fe6c61L, "bitwidth"), "" + (actualBitwidth));
    {
      SNode _nodeToCheck_1029348928467 = jUnsignedBigIntegerLiteral;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "7495353643757053721", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:9ab9fec9-ed9e-4d25-890a-7574633bec2e(xjsnark.typesystem)", "7495353643757053725", true), (SNode) node, _info_12389875345);
    }




  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x688d542e2a3492cL, 0xa31f0e921fd6a8fbL, 0x7cfe1585af18d4f2L, "xjsnark.structure.JUnsignedBigIntegerLiteral");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
