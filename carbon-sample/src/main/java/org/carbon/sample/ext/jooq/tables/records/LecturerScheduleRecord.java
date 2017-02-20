/**
 * This class is generated by jOOQ
 */
package org.carbon.sample.ext.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.carbon.sample.ext.jooq.tables.LecturerSchedule;
import org.carbon.sample.ext.jooq.tables.interfaces.ILecturerSchedule;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class LecturerScheduleRecord extends UpdatableRecordImpl<LecturerScheduleRecord> implements Record4<Long, LocalDateTime, LocalDateTime, Long>, ILecturerSchedule {

    private static final long serialVersionUID = -347958748;

    /**
     * Setter for <code>carbondb.lecturer_schedule.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>carbondb.lecturer_schedule.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>carbondb.lecturer_schedule.begin_datetime</code>.
     */
    @Override
    public void setBeginDatetime(LocalDateTime value) {
        set(1, value);
    }

    /**
     * Getter for <code>carbondb.lecturer_schedule.begin_datetime</code>.
     */
    @Override
    public LocalDateTime getBeginDatetime() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>carbondb.lecturer_schedule.end_datetime</code>.
     */
    @Override
    public void setEndDatetime(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>carbondb.lecturer_schedule.end_datetime</code>.
     */
    @Override
    public LocalDateTime getEndDatetime() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>carbondb.lecturer_schedule.lecturer_id</code>.
     */
    @Override
    public void setLecturerId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>carbondb.lecturer_schedule.lecturer_id</code>.
     */
    @Override
    public Long getLecturerId() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, LocalDateTime, LocalDateTime, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, LocalDateTime, LocalDateTime, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return LecturerSchedule.LECTURER_SCHEDULE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field2() {
        return LecturerSchedule.LECTURER_SCHEDULE.BEGIN_DATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field3() {
        return LecturerSchedule.LECTURER_SCHEDULE.END_DATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return LecturerSchedule.LECTURER_SCHEDULE.LECTURER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value2() {
        return getBeginDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value3() {
        return getEndDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getLecturerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerScheduleRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerScheduleRecord value2(LocalDateTime value) {
        setBeginDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerScheduleRecord value3(LocalDateTime value) {
        setEndDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerScheduleRecord value4(Long value) {
        setLecturerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LecturerScheduleRecord values(Long value1, LocalDateTime value2, LocalDateTime value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
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

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LecturerScheduleRecord
     */
    public LecturerScheduleRecord() {
        super(LecturerSchedule.LECTURER_SCHEDULE);
    }

    /**
     * Create a detached, initialised LecturerScheduleRecord
     */
    public LecturerScheduleRecord(Long id, LocalDateTime beginDatetime, LocalDateTime endDatetime, Long lecturerId) {
        super(LecturerSchedule.LECTURER_SCHEDULE);

        set(0, id);
        set(1, beginDatetime);
        set(2, endDatetime);
        set(3, lecturerId);
    }
}
