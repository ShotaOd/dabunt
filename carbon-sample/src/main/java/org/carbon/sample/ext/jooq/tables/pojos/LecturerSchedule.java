/**
 * This class is generated by jOOQ
 */
package org.carbon.sample.ext.jooq.tables.pojos;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.carbon.sample.ext.jooq.tables.interfaces.ILecturerSchedule;


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
public class LecturerSchedule implements ILecturerSchedule {

    private static final long serialVersionUID = 2086328536;

    private Long          id;
    private LocalDateTime beginDatetime;
    private LocalDateTime endDatetime;
    private Long          lecturerId;

    public LecturerSchedule() {}

    public LecturerSchedule(LecturerSchedule value) {
        this.id = value.id;
        this.beginDatetime = value.beginDatetime;
        this.endDatetime = value.endDatetime;
        this.lecturerId = value.lecturerId;
    }

    public LecturerSchedule(
        Long          id,
        LocalDateTime beginDatetime,
        LocalDateTime endDatetime,
        Long          lecturerId
    ) {
        this.id = id;
        this.beginDatetime = beginDatetime;
        this.endDatetime = endDatetime;
        this.lecturerId = lecturerId;
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
    public LocalDateTime getBeginDatetime() {
        return this.beginDatetime;
    }

    @Override
    public void setBeginDatetime(LocalDateTime beginDatetime) {
        this.beginDatetime = beginDatetime;
    }

    @Override
    public LocalDateTime getEndDatetime() {
        return this.endDatetime;
    }

    @Override
    public void setEndDatetime(LocalDateTime endDatetime) {
        this.endDatetime = endDatetime;
    }

    @Override
    public Long getLecturerId() {
        return this.lecturerId;
    }

    @Override
    public void setLecturerId(Long lecturerId) {
        this.lecturerId = lecturerId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LecturerSchedule (");

        sb.append(id);
        sb.append(", ").append(beginDatetime);
        sb.append(", ").append(endDatetime);
        sb.append(", ").append(lecturerId);

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
    public void from(ILecturerSchedule from) {
        setId(from.getId());
        setBeginDatetime(from.getBeginDatetime());
        setEndDatetime(from.getEndDatetime());
        setLecturerId(from.getLecturerId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ILecturerSchedule> E into(E into) {
        into.from(this);
        return into;
    }
}
