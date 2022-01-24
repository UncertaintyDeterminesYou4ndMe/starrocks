// This file is licensed under the Elastic License 2.0. Copyright 2021-present, StarRocks Limited.

package com.starrocks.sql.optimizer.rule;

public enum RuleType {
    NONE,

    TF_JOIN_ASSOCIATIVITY,
    TF_JOIN_COMMUTATIVITY,
    TF_JOIN_COMMUTATIVITY_WITHOUT_INNER,
    TF_JOIN_SEMI_REORDER,
    TF_MULTI_JOIN_ORDER,
    TF_PARTITION_PRUNE,
    TF_DISTRIBUTION_PRUNE,
    TF_LIMIT_TABLETS_PRUNE,
    TF_SPLIT_AGGREGATE,
    TF_SPLIT_TOPN,
    TF_PUSH_DOWN_JOIN_AGG,
    TF_PARTITION_PREDICATE_PRUNE,

    TF_MERGE_LIMIT_DIRECT,
    TF_MERGE_LIMIT_WITH_SORT,
    TF_MERGE_LIMIT_WITH_LIMIT,
    TF_ELIMINATE_LIMIT_ZERO,

    TF_PUSH_DOWN_LIMIT,
    TF_PUSH_DOWN_LIMIT_CTE_ANCHOR,
    TF_PUSH_DOWN_LIMIT_UNION,
    TF_PUSH_DOWN_LIMIT_JOIN,
    TF_PUSH_DOWN_PREDICATE_CTE_ANCHOR,
    TF_PUSH_DOWN_PREDICATE_SCAN,
    TF_PUSH_DOWN_PREDICATE_AGG,
    TF_PUSH_DOWN_PREDICATE_WINDOW,
    TF_PUSH_DOWN_PREDICATE_JOIN,
    TF_PUSH_DOWN_JOIN_CLAUSE,
    TF_PUSH_DOWN_PREDICATE_DIRECT,
    TF_PUSH_DOWN_PREDICATE_PROJECT,
    TF_PUSH_DOWN_PREDICATE_UNION,
    TF_PUSH_DOWN_PREDICATE_EXCEPT,
    TF_PUSH_DOWN_PREDICATE_INTERSECT,
    TF_PUSH_DOWN_PREDICATE_VALUES,
    TF_PUSH_DOWN_PREDICATE_TABLE_FUNCTION,
    TF_PUSH_DOWN_PREDICATE_REPEAT,
    TF_PUSH_DOWN_AGG_TO_META_SCAN,
    TF_MERGE_PREDICATE_SCAN,
    TF_MERGE_TWO_FILTERS,
    TF_PUSH_DOWN_PREDICATE_CTE_CONSUME,

    TF_CAST_TO_EMPTY,
    TF_ADD_PROJECT_JOIN,

    TF_PRUNE_OLAP_SCAN_COLUMNS,
    TF_PRUNE_PROJECT_COLUMNS,
    TF_PRUNE_FILTER_COLUMNS,
    TF_PRUNE_AGG_COLUMNS,
    TF_PRUNE_TOPN_COLUMNS,
    TF_PRUNE_SORT_COLUMNS,
    TF_PRUNE_JOIN_COLUMNS,
    TF_PRUNE_ANALYTIC_COLUMNS,
    TF_PRUNE_UNION_COLUMNS,
    TF_PRUNE_EXCEPT_COLUMNS,
    TF_PRUNE_INTERSECT_COLUMNS,
    TF_PRUNE_REPEAT_COLUMNS,
    TF_PRUNE_VALUES_COLUMNS,
    TF_PRUNE_TABLE_FUNCTION_COLUMNS,
    TF_PRUNE_CTE_CONSUME_COLUMNS,

    TF_SCALAR_OPERATORS_REUSE,
    TF_PRUNE_EMPTY_WINDOW,

    TF_PRUNE_PROJECT,
    TF_MERGE_TWO_PROJECT,
    TF_PRUNE_PROJECT_EMPTY,

    TF_APPLY_TO_JOIN,
    TF_QUANTIFIED_APPLY_TO_JOIN,
    TF_EXISTENTIAL_APPLY_TO_JOIN,
    TF_SCALAR_APPLY_TO_JOIN,
    TF_QUANTIFIED_APPLY_TO_OUTER_JOIN,
    TF_EXISTENTIAL_APPLY_TO_OUTER_JOIN,
    TF_MERGE_APPLY_WITH_TABLE_FUNCTION,
    TF_APPLY_EXCEPTION,

    TF_PUSH_DOWN_APPLY_PROJECT,
    TF_PUSH_DOWN_APPLY_FILTER,
    TF_PUSH_DOWN_APPLY_AGG,

    TF_PRUNE_ASSERT_ONE_ROW,
    TF_PUSH_DOWN_ASSERT_ONE_ROW_PROJECT,

    TF_MATERIALIZED_VIEW,

    TF_MERGE_TWO_AGG_RULE,

    TF_REWRITE_MULTI_DISTINCT,
    TF_REWRITE_BITMAP_COUNT_DISTINCT,
    TF_REWRITE_HLL_COUNT_DISTINCT,
    TF_REWRITE_DUPLICATE_AGGREGATE_FN,

    TF_JOIN_FORCE_LIMIT,
    TF_INTERSECT_REORDER,

    TF_MERGE_PROJECT_WITH_CHILD,

    TF_PUSH_DOWN_JOIN_ON_EXPRESSION_TO_CHILD_PROJECT,

    TF_PRUNE_UNION_EMPTY,
    TF_PRUNE_INTERSECT_EMPTY,
    TF_PRUNE_EXCEPT_EMPTY,

    TF_COLLECT_CTE_PRODUCE,
    TF_COLLECT_CTE_CONSUME,
    TF_PUSH_CTE_PRODUCE,
    TF_INLINE_CTE_CONSUME,
    TF_PRUNE_CTE_CONSUME_PLAN,
    TF_PRUNE_CTE_PRODUCE,
    TF_COMPUTE_CTE_COSTS,

    // The following are implementation rules:
    IMP_OLAP_LSCAN_TO_PSCAN,
    IMP_HIVE_LSCAN_TO_PSCAN,
    IMP_ICEBERG_LSCAN_TO_PSCAN,
    IMP_SCHEMA_LSCAN_TO_PSCAN,
    IMP_MYSQL_LSCAN_TO_PSCAN,
    IMP_ES_LSCAN_TO_PSCAN,
    IMP_META_LSCAN_TO_PSCAN,
    IMP_EQ_JOIN_TO_HASH_JOIN,
    IMP_UNION,
    IMP_EXCEPT,
    IMP_INTERSECT,
    IMP_HASH_AGGREGATE,
    IMP_PROJECT,
    IMP_SORT,
    IMP_TOPN,
    IMP_ASSERT_ONE_ROW,
    IMP_ANALYTIC,
    IMP_VALUES,
    IMP_REPEAT,
    IMP_FILTER,
    IMP_TABLE_FUNCTION,
    IMP_LIMIT,
    IMP_CTE_CONSUMER,
    IMP_CTE_ANCHOR,
    IMP_CTE_ANCHOR_TO_NO_CTE,
    IMP_CTE_PRODUCE,

    NUM_RULES;

    public int id() {
        return ordinal();
    }
}
