package io.github.jhipster.application.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Story.
 */
@Document(collection = "story")
public class Story implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    private String id;

    @Field("code")
    private String code;

    @Field("name")
    private String name;

    @Field("description")
    private String description;

    @Field("status")
    private String status;

    @DBRef
    @Field("sprint")
    @JsonIgnoreProperties("stories")
    private Sprint sprint;

    @DBRef
    @Field("student")
    private Set<Student> students = new HashSet<>();
    @DBRef
    @Field("review")
    private Set<Review> reviews = new HashSet<>();
    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public Story code(String code) {
        this.code = code;
        return this;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public Story name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public Story description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public Story status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Sprint getSprint() {
        return sprint;
    }

    public Story sprint(Sprint sprint) {
        this.sprint = sprint;
        return this;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public Story students(Set<Student> students) {
        this.students = students;
        return this;
    }

    public Story addStudent(Student student) {
        this.students.add(student);
        student.setStory(this);
        return this;
    }

    public Story removeStudent(Student student) {
        this.students.remove(student);
        student.setStory(null);
        return this;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public Story reviews(Set<Review> reviews) {
        this.reviews = reviews;
        return this;
    }

    public Story addReview(Review review) {
        this.reviews.add(review);
        review.setStory(this);
        return this;
    }

    public Story removeReview(Review review) {
        this.reviews.remove(review);
        review.setStory(null);
        return this;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Story story = (Story) o;
        if (story.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), story.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Story{" +
            "id=" + getId() +
            ", code='" + getCode() + "'" +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
}
