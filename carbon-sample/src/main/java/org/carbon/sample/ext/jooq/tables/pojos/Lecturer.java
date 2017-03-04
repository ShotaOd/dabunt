/**
 * This class is generated by jOOQ
 */
package org.carbon.sample.ext.jooq.tables.pojos;


import javax.annotation.Generated;

import org.carbon.sample.ext.jooq.tables.interfaces.ILecturer;


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
public class Lecturer implements ILecturer {

    private static final long serialVersionUID = -1050609443;

    private Long   id;
    private String username;
    private String email;
    private Long   thumbnailId;
    private String prText;
    private String password;
    private String prTextShort;

    public Lecturer() {}

    public Lecturer(Lecturer value) {
        this.id = value.id;
        this.username = value.username;
        this.email = value.email;
        this.thumbnailId = value.thumbnailId;
        this.prText = value.prText;
        this.password = value.password;
        this.prTextShort = value.prTextShort;
    }

    public Lecturer(
        Long   id,
        String username,
        String email,
        Long   thumbnailId,
        String prText,
        String password,
        String prTextShort
    ) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.thumbnailId = thumbnailId;
        this.prText = prText;
        this.password = password;
        this.prTextShort = prTextShort;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Long getThumbnailId() {
        return this.thumbnailId;
    }

    @Override
    public void setThumbnailId(Long thumbnailId) {
        this.thumbnailId = thumbnailId;
    }

    @Override
    public String getPrText() {
        return this.prText;
    }

    @Override
    public void setPrText(String prText) {
        this.prText = prText;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPrTextShort() {
        return this.prTextShort;
    }

    @Override
    public void setPrTextShort(String prTextShort) {
        this.prTextShort = prTextShort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lecturer (");

        sb.append(id);
        sb.append(", ").append(username);
        sb.append(", ").append(email);
        sb.append(", ").append(thumbnailId);
        sb.append(", ").append(prText);
        sb.append(", ").append(password);
        sb.append(", ").append(prTextShort);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ILecturer from) {
        setId(from.getId());
        setUsername(from.getUsername());
        setEmail(from.getEmail());
        setThumbnailId(from.getThumbnailId());
        setPrText(from.getPrText());
        setPassword(from.getPassword());
        setPrTextShort(from.getPrTextShort());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ILecturer> E into(E into) {
        into.from(this);
        return into;
    }
}