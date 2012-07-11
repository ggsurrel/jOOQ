/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
public class T_639NumbersTableDao extends org.jooq.impl.DAOImpl<org.jooq.test.h2.generatedclasses.tables.records.T_639NumbersTableRecord, org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable, java.lang.Integer> {

	/**
	 * Create a new T_639NumbersTableDao without any factory
	 */
	public T_639NumbersTableDao() {
		super(org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE, org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable.class);
	}

	/**
	 * Create a new T_639NumbersTableDao with an attached factory
	 */
	public T_639NumbersTableDao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE, org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.ID, values);
	}

	/**
	 * Fetch a unique that has <code>ID = value</code>
	 */
	public org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.ID, value);
	}

	/**
	 * Fetch records that have <code>BYTE IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable> fetchByByte(java.lang.Byte... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.BYTE, values);
	}

	/**
	 * Fetch records that have <code>SHORT IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable> fetchByShort(java.lang.Short... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.SHORT, values);
	}

	/**
	 * Fetch records that have <code>INTEGER IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable> fetchByInteger(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.INTEGER, values);
	}

	/**
	 * Fetch records that have <code>LONG IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable> fetchByLong(java.lang.Long... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.LONG, values);
	}

	/**
	 * Fetch records that have <code>BYTE_DECIMAL IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable> fetchByByteDecimal(java.lang.Byte... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.BYTE_DECIMAL, values);
	}

	/**
	 * Fetch records that have <code>SHORT_DECIMAL IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable> fetchByShortDecimal(java.lang.Short... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.SHORT_DECIMAL, values);
	}

	/**
	 * Fetch records that have <code>INTEGER_DECIMAL IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable> fetchByIntegerDecimal(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.INTEGER_DECIMAL, values);
	}

	/**
	 * Fetch records that have <code>LONG_DECIMAL IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable> fetchByLongDecimal(java.lang.Long... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.LONG_DECIMAL, values);
	}

	/**
	 * Fetch records that have <code>BIG_INTEGER IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable> fetchByBigInteger(java.math.BigInteger... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.BIG_INTEGER, values);
	}

	/**
	 * Fetch records that have <code>BIG_DECIMAL IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable> fetchByBigDecimal(java.math.BigDecimal... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.BIG_DECIMAL, values);
	}

	/**
	 * Fetch records that have <code>FLOAT IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable> fetchByFloat(java.lang.Float... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.FLOAT, values);
	}

	/**
	 * Fetch records that have <code>DOUBLE IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_639NumbersTable> fetchByDouble(java.lang.Double... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.T_639NumbersTable.DOUBLE, values);
	}
}
