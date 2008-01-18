package nars.language;

import java.util.*;
import nars.io.Symbols;
import nars.main.Memory;

/**
 * A Statement about an Inheritance relation.
 */
public class Implication extends Statement {
    
    /**
     * constructor with partial values, called by make
     * @param n The name of the term
     * @param arg The component list of the term
     */
    protected Implication(String n, ArrayList<Term> arg) {
        super(n, arg);
    }

    /**
     * constructor with full values, called by clone
     * @param cs component list
     * @param open open variable list
     * @param closed closed variable list
     * @param i syntactic complexity of the compound
     * @param n The name of the term
     */
    protected Implication(String n, ArrayList<Term> cs, ArrayList<Variable> open, ArrayList<Variable> closed, short i) {
        super(n, cs, open, closed, i);
    }
    
    /**
     * override the cloning methed in Object
     * @return A new object, to be casted into a SetExt
     */
    public Object clone() {
        return new Implication(name, (ArrayList<Term>) cloneList(components),
                (ArrayList<Variable>) cloneList(openVariables), (ArrayList<Variable>) cloneList(closedVariables), complexity);
    }
     
    /**
     * Try to make a new compound from two components. Called by the inference rules.
     * @param subject The first compoment
     * @param predicate The second compoment
     * @return A compound generated or a term it reduced to
     */
    public static Implication make(Term subject, Term predicate) {  // to be extended to check if subject is Conjunction
        if (invalidStatement(subject, predicate))
            return null;
        String name = makeStatementName(subject, Symbols.IMPLICATION_RELATION, predicate);
        Term t = Memory.nameToListedTerm(name);
        if (t != null)
            return (Implication) t;
        if (predicate instanceof Implication) {
            Term oldCondition = ((Implication) predicate).getSubject();
            Term newCondition = Conjunction.make(subject, oldCondition);
            return make(newCondition, ((Implication) predicate).getPredicate());
        } else {
            ArrayList<Term> argument = argumentsToList(subject, predicate);
            return new Implication(name, argument);
        }
    }
    
    /**
     * get the operator of the term.
     * @return the operator of the term
     */
    public String operator() {
        return Symbols.IMPLICATION_RELATION;
    }
}