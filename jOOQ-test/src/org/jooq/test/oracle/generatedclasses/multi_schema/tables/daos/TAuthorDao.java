/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.tables.daos;

/**
 * This class is generated by jOOQ.
 */
public class TAuthorDao extends org.jooq.impl.DAOImpl<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord, org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TAuthor, java.lang.Integer> {

	/**
	 * Create a new TAuthorDao without any factory
	 */
	public TAuthorDao() {
		super(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR, org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TAuthor.class);
	}

	/**
	 * Create a new TAuthorDao with an attached factory
	 */
	public TAuthorDao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR, org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TAuthor.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TAuthor object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TAuthor> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR.ID, values);
	}

	/**
	 * Fetch a unique that has <code>ID = value</code>
	 */
	public org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TAuthor fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR.ID, value);
	}

	/**
	 * Fetch records that have <code>FIRST_NAME IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TAuthor> fetchByFirstName(java.lang.String... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR.FIRST_NAME, values);
	}

	/**
	 * Fetch records that have <code>LAST_NAME IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TAuthor> fetchByLastName(java.lang.String... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR.LAST_NAME, values);
	}

	/**
	 * Fetch records that have <code>DATE_OF_BIRTH IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TAuthor> fetchByDateOfBirth(java.sql.Date... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR.DATE_OF_BIRTH, values);
	}

	/**
	 * Fetch records that have <code>YEAR_OF_BIRTH IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TAuthor> fetchByYearOfBirth(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR.YEAR_OF_BIRTH, values);
	}

	/**
	 * Fetch records that have <code>ADDRESS IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TAuthor> fetchByAddress(java.lang.Object... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR.ADDRESS, values);
	}
}
