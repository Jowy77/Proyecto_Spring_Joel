package com.example.proyecto_spring_joel.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "years", schema = "pitchfork")
public class YearsEntity {
    @Basic
    @Column(name = "reviewid")
    private Object reviewid;
    @Basic
    @Column(name = "year")
    private String year;
    @ManyToOne
    @JoinColumn(name = "reviewid", referencedColumnName = "reviewid", nullable = false)
    private ReviewsEntity reviewsByReviewid;

    public Object getReviewid() {
        return reviewid;
    }

    public void setReviewid(Object reviewid) {
        this.reviewid = reviewid;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YearsEntity that = (YearsEntity) o;

        if (reviewid != null ? !reviewid.equals(that.reviewid) : that.reviewid != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reviewid != null ? reviewid.hashCode() : 0;
        result = 31 * result + (year != null ? year.hashCode() : 0);
        return result;
    }

    public ReviewsEntity getReviewsByReviewid() {
        return reviewsByReviewid;
    }

    public void setReviewsByReviewid(ReviewsEntity reviewsByReviewid) {
        this.reviewsByReviewid = reviewsByReviewid;
    }
}
