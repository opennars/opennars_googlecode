/**
 * 
 */
package com.googlecode.opennars.language.logic;

/**
 * @author jgeldart
 * 
 * @param <R> 
 * @param <A> 
 *
 */
public abstract class AbstractLogicVisitor<R,A> implements LogicVisitor<R,A> {

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.StringLiteral.StringLiteralVisitor#visit(com.googlecode.opennars.language.logic.StringLiteral, java.lang.Object)
   */
  public abstract R visit(StringLiteral p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.SequentialConjunction.SequentialConjunctionVisitor#visit(com.googlecode.opennars.language.logic.SequentialConjunction, java.lang.Object)
   */
  public abstract R visit(SequentialConjunction p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.Negation.NegationVisitor#visit(com.googlecode.opennars.language.logic.Negation, java.lang.Object)
   */
  public abstract R visit(Negation p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.Similarity.SimilarityVisitor#visit(com.googlecode.opennars.language.logic.Similarity, java.lang.Object)
   */
  public abstract R visit(Similarity p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.Disjunction.DisjunctionVisitor#visit(com.googlecode.opennars.language.logic.Disjunction, java.lang.Object)
   */
  public abstract R visit(Disjunction p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.BooleanLiteral.BooleanLiteralVisitor#visit(com.googlecode.opennars.language.logic.BooleanLiteral, java.lang.Object)
   */
  public abstract R visit(BooleanLiteral p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.ParallelConjunction.ParallelConjunctionVisitor#visit(com.googlecode.opennars.language.logic.ParallelConjunction, java.lang.Object)
   */
  public abstract R visit(ParallelConjunction p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.ExtSet.ExtSetVisitor#visit(com.googlecode.opennars.language.logic.ExtSet, java.lang.Object)
   */
  public abstract R visit(ExtSet p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.ExtIntersection.ExtIntersectionVisitor#visit(com.googlecode.opennars.language.logic.ExtIntersection, java.lang.Object)
   */
  public abstract R visit(ExtIntersection p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.ExtDifference.ExtDifferenceVisitor#visit(com.googlecode.opennars.language.logic.ExtDifference, java.lang.Object)
   */
  public abstract R visit(ExtDifference p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.NumericLiteral.NumericLiteralVisitor#visit(com.googlecode.opennars.language.logic.NumericLiteral, java.lang.Object)
   */
  public abstract R visit(NumericLiteral p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.IndependentVariable.IndependentVariableVisitor#visit(com.googlecode.opennars.language.logic.IndependentVariable, java.lang.Object)
   */
  public abstract R visit(IndependentVariable p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.PastTense.PastTenseVisitor#visit(com.googlecode.opennars.language.logic.PastTense, java.lang.Object)
   */
  public abstract R visit(PastTense p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.FutureTense.FutureTenseVisitor#visit(com.googlecode.opennars.language.logic.FutureTense, java.lang.Object)
   */
  public abstract R visit(FutureTense p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.QueryVariable.QueryVariableVisitor#visit(com.googlecode.opennars.language.logic.QueryVariable, java.lang.Object)
   */
  public abstract R visit(QueryVariable p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.IntImage.IntImageVisitor#visit(com.googlecode.opennars.language.logic.IntImage, java.lang.Object)
   */
  public abstract R visit(IntImage p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.Inheritance.InheritanceVisitor#visit(com.googlecode.opennars.language.logic.Inheritance, java.lang.Object)
   */
  public abstract R visit(Inheritance p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.URIReference.URIReferenceVisitor#visit(com.googlecode.opennars.language.logic.URIReference, java.lang.Object)
   */
  public abstract R visit(URIReference p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.PresentTense.PresentTenseVisitor#visit(com.googlecode.opennars.language.logic.PresentTense, java.lang.Object)
   */
  public abstract R visit(PresentTense p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.IntDifference.IntDifferenceVisitor#visit(com.googlecode.opennars.language.logic.IntDifference, java.lang.Object)
   */
  public abstract R visit(IntDifference p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.Equivalence.EquivalenceVisitor#visit(com.googlecode.opennars.language.logic.Equivalence, java.lang.Object)
   */
  public abstract R visit(Equivalence p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.Conjunction.ConjunctionVisitor#visit(com.googlecode.opennars.language.logic.Conjunction, java.lang.Object)
   */
  public abstract R visit(Conjunction p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.ExtImage.ExtImageVisitor#visit(com.googlecode.opennars.language.logic.ExtImage, java.lang.Object)
   */
  public abstract R visit(ExtImage p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.Implication.ImplicationVisitor#visit(com.googlecode.opennars.language.logic.Implication, java.lang.Object)
   */
  public abstract R visit(Implication p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.IntIntersection.IntIntersectionVisitor#visit(com.googlecode.opennars.language.logic.IntIntersection, java.lang.Object)
   */
  public abstract R visit(IntIntersection p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.IntSet.IntSetVisitor#visit(com.googlecode.opennars.language.logic.IntSet, java.lang.Object)
   */
  public abstract R visit(IntSet p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.Product.ProductVisitor#visit(com.googlecode.opennars.language.logic.Product, java.lang.Object)
   */
  public abstract R visit(Product p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.DependentVariable.DependentVariableVisitor#visit(com.googlecode.opennars.language.logic.DependentVariable, java.lang.Object)
   */
  public abstract R visit(DependentVariable p, A arg);

  /* (non-Javadoc)
   * @see com.googlecode.opennars.language.logic.Term.Visitor#visit(com.googlecode.opennars.language.logic.Term, java.lang.Object)
   */
  public R visit(Term act, A arg) {
    return null;
  }

}
