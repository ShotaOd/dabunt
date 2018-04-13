/*
 * This file is generated by jOOQ.
*/
package org.carbon.sample.v2.ext.jooq;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.carbon.sample.v2.ext.jooq.tables.AuthClient;
import org.carbon.sample.v2.ext.jooq.tables.RockettyAuthClient;
import org.carbon.sample.v2.ext.jooq.tables.RockettyRanking;
import org.carbon.sample.v2.ext.jooq.tables.RockettyUser;
import org.carbon.sample.v2.ext.jooq.tables.User;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Carbondb extends SchemaImpl {

    private static final long serialVersionUID = 1322959008;

    /**
     * The reference instance of <code>carbondb</code>
     */
    public static final Carbondb CARBONDB = new Carbondb();

    /**
     * The table <code>carbondb.auth_client</code>.
     */
    public final AuthClient AUTH_CLIENT = org.carbon.sample.v2.ext.jooq.tables.AuthClient.AUTH_CLIENT;

    /**
     * The table <code>carbondb.rocketty_auth_client</code>.
     */
    public final RockettyAuthClient ROCKETTY_AUTH_CLIENT = org.carbon.sample.v2.ext.jooq.tables.RockettyAuthClient.ROCKETTY_AUTH_CLIENT;

    /**
     * The table <code>carbondb.rocketty_ranking</code>.
     */
    public final RockettyRanking ROCKETTY_RANKING = org.carbon.sample.v2.ext.jooq.tables.RockettyRanking.ROCKETTY_RANKING;

    /**
     * The table <code>carbondb.rocketty_user</code>.
     */
    public final RockettyUser ROCKETTY_USER = org.carbon.sample.v2.ext.jooq.tables.RockettyUser.ROCKETTY_USER;

    /**
     * The table <code>carbondb.user</code>.
     */
    public final User USER = org.carbon.sample.v2.ext.jooq.tables.User.USER;

    /**
     * No further instances allowed
     */
    private Carbondb() {
        super("carbondb", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            AuthClient.AUTH_CLIENT,
            RockettyAuthClient.ROCKETTY_AUTH_CLIENT,
            RockettyRanking.ROCKETTY_RANKING,
            RockettyUser.ROCKETTY_USER,
            User.USER);
    }
}
