/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.duckdb.system.main.tables;


import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultDataType;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.duckdb.system.main.Main;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class DuckdbConstraints extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>system.main.duckdb_constraints</code>
     */
    public static final DuckdbConstraints DUCKDB_CONSTRAINTS = new DuckdbConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>system.main.duckdb_constraints.database_name</code>.
     */
    public final TableField<Record, String> DATABASE_NAME = createField(DSL.name("database_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>system.main.duckdb_constraints.database_oid</code>.
     */
    public final TableField<Record, Long> DATABASE_OID = createField(DSL.name("database_oid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>system.main.duckdb_constraints.schema_name</code>.
     */
    public final TableField<Record, String> SCHEMA_NAME = createField(DSL.name("schema_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>system.main.duckdb_constraints.schema_oid</code>.
     */
    public final TableField<Record, Long> SCHEMA_OID = createField(DSL.name("schema_oid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>system.main.duckdb_constraints.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>system.main.duckdb_constraints.table_oid</code>.
     */
    public final TableField<Record, Long> TABLE_OID = createField(DSL.name("table_oid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>system.main.duckdb_constraints.constraint_index</code>.
     */
    public final TableField<Record, Long> CONSTRAINT_INDEX = createField(DSL.name("constraint_index"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>system.main.duckdb_constraints.constraint_type</code>.
     */
    public final TableField<Record, String> CONSTRAINT_TYPE = createField(DSL.name("constraint_type"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>system.main.duckdb_constraints.constraint_text</code>.
     */
    public final TableField<Record, String> CONSTRAINT_TEXT = createField(DSL.name("constraint_text"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>system.main.duckdb_constraints.expression</code>.
     */
    public final TableField<Record, String> EXPRESSION = createField(DSL.name("expression"), SQLDataType.VARCHAR, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> CONSTRAINT_COLUMN_INDEXES = createField(DSL.name("constraint_column_indexes"), DefaultDataType.getDefaultDataType("BIGINT[]"), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> CONSTRAINT_COLUMN_NAMES = createField(DSL.name("constraint_column_names"), DefaultDataType.getDefaultDataType("VARCHAR[]"), this, "");

    private DuckdbConstraints(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private DuckdbConstraints(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view(), where);
    }

    /**
     * Create an aliased <code>system.main.duckdb_constraints</code> table
     * reference
     */
    public DuckdbConstraints(String alias) {
        this(DSL.name(alias), DUCKDB_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>system.main.duckdb_constraints</code> table
     * reference
     */
    public DuckdbConstraints(Name alias) {
        this(alias, DUCKDB_CONSTRAINTS);
    }

    /**
     * Create a <code>system.main.duckdb_constraints</code> table reference
     */
    public DuckdbConstraints() {
        this(DSL.name("duckdb_constraints"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Main.MAIN;
    }

    @Override
    public DuckdbConstraints as(String alias) {
        return new DuckdbConstraints(DSL.name(alias), this);
    }

    @Override
    public DuckdbConstraints as(Name alias) {
        return new DuckdbConstraints(alias, this);
    }

    @Override
    public DuckdbConstraints as(Table<?> alias) {
        return new DuckdbConstraints(alias.getQualifiedName(), this);
    }
}
