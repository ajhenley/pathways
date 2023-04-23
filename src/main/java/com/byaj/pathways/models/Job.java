package com.byaj.pathways.models;

import javax.persistence.*;

@Entity
@Table(name = "job_data")
public class Job {
    @Id
    private String id;
    private String onetsoc_code;
    private String title;
    private String description;
    private String image;
    private String payrange;
    private String median_pay;
    private String entry_ed;
    private String work_exp;
    private String terse_description;
    private String long_description;
    private String alt_titles;
    private String related_occs_short;
    private String related_occs_long;
    private String related_occs_supplemental;
    private String duties;
    private String video_url;

    public Job() {
    }

    public Job(String onetsoc_code, String title, String description, String image, String payrange, String median_pay, String entry_ed, String work_exp, String terse_description, String long_description, String alt_titles, String related_occs_short, String related_occs_long, String related_occs_supplemental, String duties, String video_url) {
        this.onetsoc_code = onetsoc_code;
        this.title = title;
        this.description = description;
        this.image = image;
        this.payrange = payrange;
        this.median_pay = median_pay;
        this.entry_ed = entry_ed;
        this.work_exp = work_exp;
        this.terse_description = terse_description;
        this.long_description = long_description;
        this.alt_titles = alt_titles;
        this.related_occs_short = related_occs_short;
        this.related_occs_long = related_occs_long;
        this.related_occs_supplemental = related_occs_supplemental;
        this.duties = duties;
        this.video_url = video_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOnetsoc_code() {
        return onetsoc_code;
    }

    public void setOnetsoc_code(String onetsoc_code) {
        this.onetsoc_code = onetsoc_code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPayrange() {
        return payrange;
    }

    public void setPayrange(String payrange) {
        this.payrange = payrange;
    }

    public String getMedian_pay() {
        return median_pay;
    }

    public void setMedian_pay(String median_pay) {
        this.median_pay = median_pay;
    }

    public String getEntry_ed() {
        return entry_ed;
    }

    public void setEntry_ed(String entry_ed) {
        this.entry_ed = entry_ed;
    }

    public String getWork_exp() {
        return work_exp;
    }

    public void setWork_exp(String work_exp) {
        this.work_exp = work_exp;
    }

    public String getTerse_description() {
        return terse_description;
    }

    public void setTerse_description(String terse_description) {
        this.terse_description = terse_description;
    }

    public String getLong_description() {
        return long_description;
    }

    public void setLong_description(String long_description) {
        this.long_description = long_description;
    }

    public String getAlt_titles() {
        return alt_titles;
    }

    public void setAlt_titles(String alt_titles) {
        this.alt_titles = alt_titles;
    }

    public String getRelated_occs_short() {
        return related_occs_short;
    }

    public void setRelated_occs_short(String related_occs_short) {
        this.related_occs_short = related_occs_short;
    }

    public String getRelated_occs_long() {
        return related_occs_long;
    }

    public void setRelated_occs_long(String related_occs_long) {
        this.related_occs_long = related_occs_long;
    }

    public String getRelated_occs_supplemental() {
        return related_occs_supplemental;
    }

    public void setRelated_occs_supplemental(String related_occs_supplemental) {
        this.related_occs_supplemental = related_occs_supplemental;
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
