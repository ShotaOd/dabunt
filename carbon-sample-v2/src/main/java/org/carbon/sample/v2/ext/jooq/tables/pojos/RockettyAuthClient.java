/*
 * This file is generated by jOOQ.
*/
package org.carbon.sample.v2.ext.jooq.tables.pojos;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.carbon.sample.v2.ext.jooq.tables.interfaces.IRockettyAuthClient;


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
public class RockettyAuthClient implements IRockettyAuthClient {

    private static final long serialVersionUID = -1046467502;

    private final Long          id;
    private final String        clientId;
    private final String        clientSecret;
    private final Boolean       valid;
    private final LocalDateTime expireAt;

    public RockettyAuthClient(RockettyAuthClient value) {
        this.id = value.id;
        this.clientId = value.clientId;
        this.clientSecret = value.clientSecret;
        this.valid = value.valid;
        this.expireAt = value.expireAt;
    }

    public RockettyAuthClient(
        Long          id,
        String        clientId,
        String        clientSecret,
        Boolean       valid,
        LocalDateTime expireAt
    ) {
        this.id = id;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.valid = valid;
        this.expireAt = expireAt;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getClientId() {
        return this.clientId;
    }

    @Override
    public String getClientSecret() {
        return this.clientSecret;
    }

    @Override
    public Boolean getValid() {
        return this.valid;
    }

    @Override
    public LocalDateTime getExpireAt() {
        return this.expireAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RockettyAuthClient (");

        sb.append(id);
        sb.append(", ").append(clientId);
        sb.append(", ").append(clientSecret);
        sb.append(", ").append(valid);
        sb.append(", ").append(expireAt);

        sb.append(")");
        return sb.toString();
    }
}
