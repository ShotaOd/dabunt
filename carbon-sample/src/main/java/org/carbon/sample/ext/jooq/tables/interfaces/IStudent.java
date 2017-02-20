/**
 * This class is generated by jOOQ
 */
package org.carbon.sample.ext.jooq.tables.interfaces;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IStudent extends Serializable {

    /**
     * Setter for <code>carbondb.student.id</code>.
     */
    public void setId(Long value);

    /**
     * Getter for <code>carbondb.student.id</code>.
     */
    public Long getId();

    /**
     * Setter for <code>carbondb.student.password</code>.
     */
    public void setPassword(String value);

    /**
     * Getter for <code>carbondb.student.password</code>.
     */
    public String getPassword();

    /**
     * Setter for <code>carbondb.student.username</code>.
     */
    public void setUsername(String value);

    /**
     * Getter for <code>carbondb.student.username</code>.
     */
    public String getUsername();

    /**
     * Setter for <code>carbondb.student.email</code>.
     */
    public void setEmail(String value);

    /**
     * Getter for <code>carbondb.student.email</code>.
     */
    public String getEmail();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IStudent
     */
    public void from(org.carbon.sample.ext.jooq.tables.interfaces.IStudent from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IStudent
     */
    public <E extends org.carbon.sample.ext.jooq.tables.interfaces.IStudent> E into(E into);
}
