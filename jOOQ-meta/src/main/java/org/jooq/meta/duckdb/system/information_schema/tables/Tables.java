/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.duckdb.system.information_schema.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.duckdb.system.information_schema.InformationSchema;
import org.jooq.meta.duckdb.system.information_schema.Keys;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Tables extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>system.information_schema.tables</code>
     */
    public static final Tables TABLES = new Tables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>system.information_schema.tables.table_catalog</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>system.information_schema.tables.table_schema</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>system.information_schema.tables.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>system.information_schema.tables.table_type</code>.
     */
    public final TableField<Record, String> TABLE_TYPE = createField(DSL.name("table_type"), SQLDataType.VARCHAR, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> SELF_REFERENCING_COLUMN_NAME = createField(DSL.name("self_referencing_column_name"), SQLDataType.OTHER, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> REFERENCE_GENERATION = createField(DSL.name("reference_generation"), SQLDataType.OTHER, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> USER_DEFINED_TYPE_CATALOG = createField(DSL.name("user_defined_type_catalog"), SQLDataType.OTHER, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> USER_DEFINED_TYPE_SCHEMA = createField(DSL.name("user_defined_type_schema"), SQLDataType.OTHER, this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> USER_DEFINED_TYPE_NAME = createField(DSL.name("user_defined_type_name"), SQLDataType.OTHER, this, "");

    /**
     * The column
     * <code>system.information_schema.tables.is_insertable_into</code>.
     */
    public final TableField<Record, String> IS_INSERTABLE_INTO = createField(DSL.name("is_insertable_into"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>system.information_schema.tables.is_typed</code>.
     */
    public final TableField<Record, String> IS_TYPED = createField(DSL.name("is_typed"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>system.information_schema.tables.commit_action</code>.
     */
    public final TableField<Record, String> COMMIT_ACTION = createField(DSL.name("commit_action"), SQLDataType.VARCHAR, this, "");

    private Tables(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Tables(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view(), where);
    }

    /**
     * Create an aliased <code>system.information_schema.tables</code> table
     * reference
     */
    public Tables(String alias) {
        this(DSL.name(alias), TABLES);
    }

    /**
     * Create an aliased <code>system.information_schema.tables</code> table
     * reference
     */
    public Tables(Name alias) {
        this(alias, TABLES);
    }

    /**
     * Create a <code>system.information_schema.tables</code> table reference
     */
    public Tables() {
        this(DSL.name("tables"), null);
    }

    public <O extends Record> Tables(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, TABLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_TABLES;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.SYNTHETIC_FK_TABLES__SYNTHETIC_PK_SCHEMATA);
    }

    private transient Schemata _schemata;

    /**
     * Get the implicit join path to the
     * <code>system.information_schema.schemata</code> table.
     */
    public Schemata schemata() {
        if (_schemata == null)
            _schemata = new Schemata(this, Keys.SYNTHETIC_FK_TABLES__SYNTHETIC_PK_SCHEMATA, null);

        return _schemata;
    }

    private transient Columns _columns;

    /**
     * Get the implicit to-many join path to the
     * <code>system.information_schema.columns</code> table
     */
    public Columns columns() {
        if (_columns == null)
            _columns = new Columns(this, null, Keys.SYNTHETIC_FK_COLUMNS__SYNTHETIC_PK_TABLES.getInverseKey());

        return _columns;
    }

    @Override
    public Tables as(String alias) {
        return new Tables(DSL.name(alias), this);
    }

    @Override
    public Tables as(Name alias) {
        return new Tables(alias, this);
    }

    @Override
    public Tables as(Table<?> alias) {
        return new Tables(alias.getQualifiedName(), this);
    }
}
