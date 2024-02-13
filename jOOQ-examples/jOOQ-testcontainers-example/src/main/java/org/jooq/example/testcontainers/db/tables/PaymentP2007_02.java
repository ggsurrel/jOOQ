/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainers.db.tables;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Check;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.example.testcontainers.db.Indexes;
import org.jooq.example.testcontainers.db.Keys;
import org.jooq.example.testcontainers.db.Public;
import org.jooq.example.testcontainers.db.tables.Customer.CustomerPath;
import org.jooq.example.testcontainers.db.tables.Rental.RentalPath;
import org.jooq.example.testcontainers.db.tables.Staff.StaffPath;
import org.jooq.example.testcontainers.db.tables.records.PaymentP2007_02Record;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PaymentP2007_02 extends TableImpl<PaymentP2007_02Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.payment_p2007_02</code>
     */
    public static final PaymentP2007_02 PAYMENT_P2007_02 = new PaymentP2007_02();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentP2007_02Record> getRecordType() {
        return PaymentP2007_02Record.class;
    }

    /**
     * The column <code>public.payment_p2007_02.payment_id</code>.
     */
    public final TableField<PaymentP2007_02Record, Long> PAYMENT_ID = createField(DSL.name("payment_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.payment_p2007_02.customer_id</code>.
     */
    public final TableField<PaymentP2007_02Record, Long> CUSTOMER_ID = createField(DSL.name("customer_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.payment_p2007_02.staff_id</code>.
     */
    public final TableField<PaymentP2007_02Record, Long> STAFF_ID = createField(DSL.name("staff_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.payment_p2007_02.rental_id</code>.
     */
    public final TableField<PaymentP2007_02Record, Long> RENTAL_ID = createField(DSL.name("rental_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.payment_p2007_02.amount</code>.
     */
    public final TableField<PaymentP2007_02Record, BigDecimal> AMOUNT = createField(DSL.name("amount"), SQLDataType.NUMERIC(5, 2).nullable(false), this, "");

    /**
     * The column <code>public.payment_p2007_02.payment_date</code>.
     */
    public final TableField<PaymentP2007_02Record, LocalDateTime> PAYMENT_DATE = createField(DSL.name("payment_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    private PaymentP2007_02(Name alias, Table<PaymentP2007_02Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PaymentP2007_02(Name alias, Table<PaymentP2007_02Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.payment_p2007_02</code> table reference
     */
    public PaymentP2007_02(String alias) {
        this(DSL.name(alias), PAYMENT_P2007_02);
    }

    /**
     * Create an aliased <code>public.payment_p2007_02</code> table reference
     */
    public PaymentP2007_02(Name alias) {
        this(alias, PAYMENT_P2007_02);
    }

    /**
     * Create a <code>public.payment_p2007_02</code> table reference
     */
    public PaymentP2007_02() {
        this(DSL.name("payment_p2007_02"), null);
    }

    public <O extends Record> PaymentP2007_02(Table<O> path, ForeignKey<O, PaymentP2007_02Record> childPath, InverseForeignKey<O, PaymentP2007_02Record> parentPath) {
        super(path, childPath, parentPath, PAYMENT_P2007_02);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class PaymentP2007_02Path extends PaymentP2007_02 implements Path<PaymentP2007_02Record> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> PaymentP2007_02Path(Table<O> path, ForeignKey<O, PaymentP2007_02Record> childPath, InverseForeignKey<O, PaymentP2007_02Record> parentPath) {
            super(path, childPath, parentPath);
        }
        private PaymentP2007_02Path(Name alias, Table<PaymentP2007_02Record> aliased) {
            super(alias, aliased);
        }

        @Override
        public PaymentP2007_02Path as(String alias) {
            return new PaymentP2007_02Path(DSL.name(alias), this);
        }

        @Override
        public PaymentP2007_02Path as(Name alias) {
            return new PaymentP2007_02Path(alias, this);
        }

        @Override
        public PaymentP2007_02Path as(Table<?> alias) {
            return new PaymentP2007_02Path(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_FK_PAYMENT_P2007_02_CUSTOMER_ID, Indexes.IDX_FK_PAYMENT_P2007_02_STAFF_ID);
    }

    @Override
    public Identity<PaymentP2007_02Record, Long> getIdentity() {
        return (Identity<PaymentP2007_02Record, Long>) super.getIdentity();
    }

    @Override
    public List<ForeignKey<PaymentP2007_02Record, ?>> getReferences() {
        return Arrays.asList(Keys.PAYMENT_P2007_02__PAYMENT_P2007_02_CUSTOMER_ID_FKEY, Keys.PAYMENT_P2007_02__PAYMENT_P2007_02_STAFF_ID_FKEY, Keys.PAYMENT_P2007_02__PAYMENT_P2007_02_RENTAL_ID_FKEY);
    }

    private transient CustomerPath _customer;

    /**
     * Get the implicit join path to the <code>public.customer</code> table.
     */
    public CustomerPath customer() {
        if (_customer == null)
            _customer = new CustomerPath(this, Keys.PAYMENT_P2007_02__PAYMENT_P2007_02_CUSTOMER_ID_FKEY, null);

        return _customer;
    }

    private transient StaffPath _staff;

    /**
     * Get the implicit join path to the <code>public.staff</code> table.
     */
    public StaffPath staff() {
        if (_staff == null)
            _staff = new StaffPath(this, Keys.PAYMENT_P2007_02__PAYMENT_P2007_02_STAFF_ID_FKEY, null);

        return _staff;
    }

    private transient RentalPath _rental;

    /**
     * Get the implicit join path to the <code>public.rental</code> table.
     */
    public RentalPath rental() {
        if (_rental == null)
            _rental = new RentalPath(this, Keys.PAYMENT_P2007_02__PAYMENT_P2007_02_RENTAL_ID_FKEY, null);

        return _rental;
    }

    @Override
    public List<Check<PaymentP2007_02Record>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("payment_p2007_02_payment_date_check"), "(((payment_date >= '2007-02-01 00:00:00'::timestamp without time zone) AND (payment_date < '2007-03-01 00:00:00'::timestamp without time zone)))", true)
        );
    }

    @Override
    public PaymentP2007_02 as(String alias) {
        return new PaymentP2007_02(DSL.name(alias), this);
    }

    @Override
    public PaymentP2007_02 as(Name alias) {
        return new PaymentP2007_02(alias, this);
    }

    @Override
    public PaymentP2007_02 as(Table<?> alias) {
        return new PaymentP2007_02(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentP2007_02 rename(String name) {
        return new PaymentP2007_02(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentP2007_02 rename(Name name) {
        return new PaymentP2007_02(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PaymentP2007_02 rename(Table<?> name) {
        return new PaymentP2007_02(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_02 where(Condition condition) {
        return new PaymentP2007_02(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_02 where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_02 where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_02 where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PaymentP2007_02 where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PaymentP2007_02 where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PaymentP2007_02 where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public PaymentP2007_02 where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_02 whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public PaymentP2007_02 whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
