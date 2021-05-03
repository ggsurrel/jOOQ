/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import static org.jooq.impl.Tools.recordType;

import org.jooq.CharacterSet;
import org.jooq.Collation;
import org.jooq.Field;
import org.jooq.Nullability;
import org.jooq.Record;
import org.jooq.RecordType;
import org.jooq.Row;

import org.jetbrains.annotations.Nullable;

/**
 * A wrapper for anonymous array data types
 *
 * @author Lukas Eder
 */
final class RecordDataType<R extends Record> extends DefaultDataType<R> {

    final Row row;

    @SuppressWarnings("unchecked")
    public RecordDataType(Row row) {
        // [#11829] TODO: Implement this correctly for UDTRecord, TableRecord, and EmbeddableRecord
        super(null, (Class<R>) recordType(row.size()), "record", "record");

        this.row = row;
    }

    /**
     * [#3225] Performant constructor for creating derived types.
     */
    RecordDataType(
        DefaultDataType<R> t,
        Row row,
        Integer precision,
        Integer scale,
        Integer length,
        Nullability nullability,
        Collation collation,
        CharacterSet characterSet,
        boolean identity,
        Field<R> defaultValue
    ) {
        super(t, precision, scale, length, nullability, collation, characterSet, identity, defaultValue);

        this.row = row;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    DefaultDataType<R> construct(
        Integer newPrecision,
        Integer newScale,
        Integer newLength,
        Nullability
        newNullability,
        Collation newCollation,
        CharacterSet newCharacterSet,
        boolean newIdentity,
        Field<R> newDefaultValue
    ) {
        return new RecordDataType<>(
            this,
            row,
            newPrecision,
            newScale,
            newLength,
            newNullability,
            newCollation,
            newCharacterSet,
            newIdentity,
            (Field) newDefaultValue
        );
    }

    @Override
    public final Row getRow() {
        return row;
    }
}
