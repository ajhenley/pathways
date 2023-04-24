package com.byaj.pathways.models;

import javax.persistence.*;

@Entity
@Table(name = "job_data")
public class Job {
    @Id
    private int id;

    @Column(name="onetsoc_code")
    private String onetsoccode;
    private String title;
    private String description;
    private String image;
    private int numpositions;
    private double numposdelta;
    private String payrange;
    @Column(name="median_pay")
    private String medianpay;
    @Column(name="entry_ed")
    private String entryed;
    @Column(name="work_exp")
    private String workexp;
    @Column(name="terse_description")
    private String tersedescription;
    @Column(name="long_description")
    private String longdescription;
    @Column(name="alt_titles")
    private String alttitles;
    @Column(name="related_occs_short")
    private String relatedoccsshort;
    @Column(name="related_occs_long")
    private String relatedoccslong;
    @Column(name="related_occs_supplemental")
    private String relatedoccssupplemental;
    private String duties;

    @Column(name="video_url")
    private String videourl;

    public Job() {
    }

    public Job(String onetsoccode, String title, String description, String image, int numpositions, double numposdelta, String payrange, String medianpay, String entryed, String workexp, String tersedescription, String longdescription, String alttitles, String relatedoccsshort, String relatedoccslong, String relatedoccssupplemental, String duties, String videourl) {
        this.onetsoccode = onetsoccode;
        this.title = title;
        this.description = description;
        this.image = image;
        this.numpositions = numpositions;
        this.numposdelta = numposdelta;
        this.payrange = payrange;
        this.medianpay = medianpay;
        this.entryed = entryed;
        this.workexp = workexp;
        this.tersedescription = tersedescription;
        this.longdescription = longdescription;
        this.alttitles = alttitles;
        this.relatedoccsshort = relatedoccsshort;
        this.relatedoccslong = relatedoccslong;
        this.relatedoccssupplemental = relatedoccssupplemental;
        this.duties = duties;
        this.videourl = videourl;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOnetsoccode() {
        return onetsoccode;
    }

    public void setOnetsoccode(String onetsoccode) {
        this.onetsoccode = onetsoccode;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getNumpositions() {
        return numpositions;
    }

    public void setNumpositions(int numpositions) {
        this.numpositions = numpositions;
    }

    public double getNumposdelta() {
        return numposdelta;
    }

    public void setNumposdelta(double numposdelta) {
        this.numposdelta = numposdelta;
    }

    public String getPayrange() {
        return payrange;
    }

    public void setPayrange(String payrange) {
        this.payrange = payrange;
    }

    public String getMedianpay() {
        return medianpay;
    }

    public void setMedianpay(String medianpay) {
        this.medianpay = medianpay;
    }

    public String getEntryed() {
        return entryed;
    }

    public void setEntryed(String entryed) {
        this.entryed = entryed;
    }

    public String getWorkexp() {
        return workexp;
    }

    public void setWorkexp(String workexp) {
        this.workexp = workexp;
    }

    public String getTersedescription() {
        return tersedescription;
    }

    public void setTersedescription(String tersedescription) {
        this.tersedescription = tersedescription;
    }

    public String getLongdescription() {
        return longdescription;
    }

    public void setLongdescription(String longdescription) {
        this.longdescription = longdescription;
    }

    public String getAlttitles() {
        return alttitles;
    }

    public void setAlttitles(String alttitles) {
        this.alttitles = alttitles;
    }

    public String getRelatedoccsshort() {
        return relatedoccsshort;
    }

    public void setRelatedoccsshort(String relatedoccsshort) {
        this.relatedoccsshort = relatedoccsshort;
    }

    public String getRelatedoccslong() {
        return relatedoccslong;
    }

    public void setRelatedoccslong(String relatedoccslong) {
        this.relatedoccslong = relatedoccslong;
    }

    public String getRelatedoccssupplemental() {
        return relatedoccssupplemental;
    }

    public void setRelatedoccssupplemental(String relatedoccssupplemental) {
        this.relatedoccssupplemental = relatedoccssupplemental;
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }
}
