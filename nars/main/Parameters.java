/*
 * Parameters.java
 *
 * Copyright (C) 2008  Pei Wang
 *
 * This file is part of Open-NARS.
 *
 * Open-NARS is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * Open-NARS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Open-NARS.  If not, see <http://www.gnu.org/licenses/>.
 */
package nars.main;

/**
 * Collected system parameters. To be modified before compiling.
 */
public class Parameters {

    /* ---------- initial values of run-time adjustable parameters ---------- */
    /** Concept decay rate in ConceptBag, in [1, 99]. */
    public static final int CONCEPT_FORGETTING_CYCLE = 3;
    /** TaskLink decay rate in TaskLinkBag, in [1, 99]. */
    public static final int TASK_LINK_FORGETTING_CYCLE = 10;
    /** TermLink decay rate in TermLinkBag, in [1, 99]. */
    public static final int TERM_LINK_FORGETTING_CYCLE = 50;
    /** Silent threshold for task reporting, in [0, 100]. */
    public static final int SILENT_LEVEL = 10;

    /* ---------- time management ---------- */
    /** Task decay rate in TaskBuffer, in [1, 99]. */
    public static final int NEW_TASK_FORGETTING_CYCLE = 1;
    /** Maximum TermLinks checked for novelity for each TaskLink in TermLinkBag */
    public static final int MAX_MATCHED_TERM_LINK = 10;
    /** Maximum TermLinks used in reasoning for each Task in Concept */
    public static final int MAX_REASONED_TERM_LINK = 3;

    /* ---------- logical parameters ---------- */
    /** Horizon, the amount of evidence coming in the near future. */
    public static final int NEAR_FUTURE = 1;    // or 2, can be float
    /** The desireability threthold for an operation to be executed. */
    public static final float DECISION_THRESHOLD = (float) 0.66;
    /** Range of temporal induction in input events. */
    public static final int MAXMUM_EVENTS_LENGTH = 10;

    /* ---------- budget thresholds ---------- */
    /** The budget threthold for task to be accepted. */
    public static final float BUDGET_THRESHOLD = (float) 0.001;
    /** The priority threthold for operation to be executed. */
    public static final float PRIORITY_THRESHOLD = (float) 0.06;

    /* ---------- default input values ---------- */
    /** Default confidence of input judgment. */
    public static final float DEFAULT_JUDGMENT_CONFIDENCE = (float) 0.9;
    /** Default priority of input judgment */
    public static final float DEFAULT_JUDGMENT_PRIORITY = (float) 0.8;
    /** Default durability of input judgment */
    public static final float DEFAULT_JUDGMENT_DURABILITY = (float) 0.8;
    /** Default priority of input goal */
    public static final float DEFAULT_GOAL_PRIORITY = (float) 0.9;
    /** Default durability of input goal */
    public static final float DEFAULT_GOAL_DURABILITY = (float) 0.7;
    /** Default priority of input question */
    public static final float DEFAULT_QUESTION_PRIORITY = (float) 0.9;
    /** Default durability of input question */
    public static final float DEFAULT_QUESTION_DURABILITY = (float) 0.7;

    /* ---------- space management ---------- */
    /** Level granularity in Bag, two digits */
    public static final int BAG_LEVEL = 100;
    /** Level separation in Bag, one digit, for display (run-time adjustable) and management (fixed) */
    public static final int BAG_THRESHOLD = 10;
    /** Hashtable load factor in Bag */
    public static final float LOAD_FACTOR = (float) 0.5;
    /** Size of ConceptBag */
    public static final int CONCEPT_BAG_SIZE = 1000;
    /** Size of TaskLinkBag */
    public static final int TASK_LINK_BAG_SIZE = 20;
    /** Size of TermLinkBag */
    public static final int TERM_LINK_BAG_SIZE = 100;
    /** Size of TaskBuffer */
    public static final int TASK_BUFFER_SIZE = 20;
    
    /* ---------- avoiding repeated reasoning ---------- */
    /** Maximum length of Stamp, a power of 2 */
    public static final int MAXMUM_STAMP_LENGTH = 16;
    /** Remember recently used TermLink on a Task */
    public static final int TERM_LINK_RECORD_LENGTH = 10;
    /** Maximum number of beliefs kept in a Concept */
    public static final int MAXMUM_BELIEF_LENGTH = 8;
    /** Maximum number of goals kept in a Concept */
    public static final int MAXMUM_GOALS_LENGTH = 5;
}