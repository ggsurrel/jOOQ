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

import static org.jooq.impl.DSL.*;
import static org.jooq.impl.Internal.*;
import static org.jooq.impl.Keywords.*;
import static org.jooq.impl.Names.*;
import static org.jooq.impl.SQLDataType.*;
import static org.jooq.impl.Tools.*;
import static org.jooq.impl.Tools.BooleanDataKey.*;
import static org.jooq.impl.Tools.DataExtendedKey.*;
import static org.jooq.impl.Tools.DataKey.*;
import static org.jooq.SQLDialect.*;

import org.jooq.*;
import org.jooq.Function1;
import org.jooq.Record;
import org.jooq.conf.*;
import org.jooq.impl.*;
import org.jooq.impl.QOM.*;
import org.jooq.tools.*;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;


/**
 * The <code>CHAR LENGTH</code> statement.
 */
@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
final class CharLength
extends
    AbstractField<Integer>
implements
    QOM.CharLength
{

    final Field<String> string;

    CharLength(
        Field<String> string
    ) {
        super(
            N_CHAR_LENGTH,
            allNotNull(INTEGER, string)
        );

        this.string = nullSafeNotNull(string, VARCHAR);
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------

    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {





















            case DERBY:
            case SQLITE:
                ctx.visit(function(N_LENGTH, getDataType(), string));
                break;

            default:
                ctx.visit(function(N_CHAR_LENGTH, getDataType(), string));
                break;
        }
    }












    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    @Override
    public final Field<String> $string() {
        return string;
    }

    @Override
    public final QOM.CharLength $string(Field<String> newValue) {
        return constructor().apply(newValue);
    }

    public final Function1<? super Field<String>, ? extends QOM.CharLength> constructor() {
        return (a1) -> new CharLength(a1);
    }

    @Override
    public final QueryPart $replace(
        Predicate<? super QueryPart> recurse,
        Function1<? super QueryPart, ? extends QueryPart> replacement
    ) {
        return QOM.replace(
            this,
            $string(),
            (a1) -> constructor().apply(a1),
            recurse,
            replacement
        );
    }

    @Override
    public final <R> R $traverse(Traverser<?, R> traverser) {
        return QOM.traverse(traverser, this,
            $string()
        );
    }

    // -------------------------------------------------------------------------
    // XXX: The Object API
    // -------------------------------------------------------------------------

    @Override
    public boolean equals(Object that) {
        if (that instanceof QOM.CharLength) { QOM.CharLength o = (QOM.CharLength) that;
            return
                StringUtils.equals($string(), o.$string())
            ;
        }
        else
            return super.equals(that);
    }
}
