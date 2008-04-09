/**
 * 
 */
package com.googlecode.opennars.language.logic;

import com.googlecode.opennars.language.logic.BooleanLiteral.BooleanLiteralVisitor;
import com.googlecode.opennars.language.logic.Conjunction.ConjunctionVisitor;
import com.googlecode.opennars.language.logic.DependentVariable.DependentVariableVisitor;
import com.googlecode.opennars.language.logic.Disjunction.DisjunctionVisitor;
import com.googlecode.opennars.language.logic.Equivalence.EquivalenceVisitor;
import com.googlecode.opennars.language.logic.ExtDifference.ExtDifferenceVisitor;
import com.googlecode.opennars.language.logic.ExtImage.ExtImageVisitor;
import com.googlecode.opennars.language.logic.ExtIntersection.ExtIntersectionVisitor;
import com.googlecode.opennars.language.logic.ExtSet.ExtSetVisitor;
import com.googlecode.opennars.language.logic.FutureTense.FutureTenseVisitor;
import com.googlecode.opennars.language.logic.Implication.ImplicationVisitor;
import com.googlecode.opennars.language.logic.IndependentVariable.IndependentVariableVisitor;
import com.googlecode.opennars.language.logic.Inheritance.InheritanceVisitor;
import com.googlecode.opennars.language.logic.IntDifference.IntDifferenceVisitor;
import com.googlecode.opennars.language.logic.IntImage.IntImageVisitor;
import com.googlecode.opennars.language.logic.IntIntersection.IntIntersectionVisitor;
import com.googlecode.opennars.language.logic.IntSet.IntSetVisitor;
import com.googlecode.opennars.language.logic.Negation.NegationVisitor;
import com.googlecode.opennars.language.logic.NumericLiteral.NumericLiteralVisitor;
import com.googlecode.opennars.language.logic.ParallelConjunction.ParallelConjunctionVisitor;
import com.googlecode.opennars.language.logic.PastTense.PastTenseVisitor;
import com.googlecode.opennars.language.logic.PresentTense.PresentTenseVisitor;
import com.googlecode.opennars.language.logic.Product.ProductVisitor;
import com.googlecode.opennars.language.logic.QueryVariable.QueryVariableVisitor;
import com.googlecode.opennars.language.logic.SequentialConjunction.SequentialConjunctionVisitor;
import com.googlecode.opennars.language.logic.Similarity.SimilarityVisitor;
import com.googlecode.opennars.language.logic.StringLiteral.StringLiteralVisitor;
import com.googlecode.opennars.language.logic.URIReference.URIReferenceVisitor;

/**
 * @author jgeldart
 *
 */
public interface LogicVisitor<R,A> extends BooleanLiteralVisitor<R, A>,
    ConjunctionVisitor<R, A>, DependentVariableVisitor<R, A>,
    DisjunctionVisitor<R, A>, EquivalenceVisitor<R, A>,
    ExtDifferenceVisitor<R, A>, ExtImageVisitor<R, A>,
    ExtIntersectionVisitor<R, A>, ExtSetVisitor<R, A>,
    FutureTenseVisitor<R, A>, ImplicationVisitor<R, A>,
    IndependentVariableVisitor<R, A>, InheritanceVisitor<R, A>,
    IntDifferenceVisitor<R, A>, IntImageVisitor<R, A>,
    IntIntersectionVisitor<R, A>, IntSetVisitor<R, A>, NegationVisitor<R, A>,
    NumericLiteralVisitor<R, A>, ParallelConjunctionVisitor<R, A>,
    PastTenseVisitor<R, A>, PresentTenseVisitor<R, A>, ProductVisitor<R, A>,
    QueryVariableVisitor<R, A>, SequentialConjunctionVisitor<R, A>,
    SimilarityVisitor<R, A>, StringLiteralVisitor<R, A>,
    URIReferenceVisitor<R, A> {

}
