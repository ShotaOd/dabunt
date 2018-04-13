/*
 * This file is generated by jOOQ.
*/
package org.carbon.sample.v2.ext.jooq.tables.interfaces;


import java.io.Serializable;

import javax.annotation.Generated;


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
public interface IUser extends Serializable {

    /**
     * Getter for <code>carbondb.user.id</code>.
     */
    public Long getId();

    /**
     * Getter for <code>carbondb.user.email</code>.
     */
    public String getEmail();

    /**
     * Getter for <code>carbondb.user.user_name</code>.
     */
    public String getUserName();

    /**
     * Getter for <code>carbondb.user.password</code>.
     */
    public String getPassword();
}
