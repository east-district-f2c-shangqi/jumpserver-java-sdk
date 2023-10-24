package com.jumpserver.sdk.v2.model;

import com.jumpserver.sdk.v2.model.entity.ModelEntity;

public class Tickets implements ModelEntity {
    private String id;
    private String  title;
    private String type;
    private String type_display;
    private String meta;
    private String state;
    private Integer approval_step;
    private String status;
    private String status_display;
    private String applicant_display;
    private String process_map;
    private String date_created;
    private String date_updated;
    private String comment;
    private String org_id;
    private String org_name;
    private String body;
    private String serial_num;
    private String applicant;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType_display() {
        return type_display;
    }

    public void setType_display(String type_display) {
        this.type_display = type_display;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getApproval_step() {
        return approval_step;
    }

    public void setApproval_step(Integer approval_step) {
        this.approval_step = approval_step;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus_display() {
        return status_display;
    }

    public void setStatus_display(String status_display) {
        this.status_display = status_display;
    }

    public String getApplicant_display() {
        return applicant_display;
    }

    public void setApplicant_display(String applicant_display) {
        this.applicant_display = applicant_display;
    }

    public String getProcess_map() {
        return process_map;
    }

    public void setProcess_map(String process_map) {
        this.process_map = process_map;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getDate_updated() {
        return date_updated;
    }

    public void setDate_updated(String date_updated) {
        this.date_updated = date_updated;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSerial_num() {
        return serial_num;
    }

    public void setSerial_num(String serial_num) {
        this.serial_num = serial_num;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }
}
