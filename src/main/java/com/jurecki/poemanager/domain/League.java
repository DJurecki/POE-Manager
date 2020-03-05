package com.jurecki.poemanager.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@Entity
public class League {

    @Id
    private String id;
    private String realm;
    private String description;
    private String registerAt;
    private String url;
    private String startAt;
    private String endAt;
    private Boolean delveEvent;
    private String[] rules;

    public League() {
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id='" + id + '\'' +
                ", realm='" + realm + '\'' +
                ", description='" + description + '\'' +
                ", registerAt='" + registerAt + '\'' +
                ", url='" + url + '\'' +
                ", startAt='" + startAt + '\'' +
                ", endAt=" + endAt +
                ", delveEvent=" + delveEvent +
                ", rules=" + Arrays.toString(rules) +
                '}';
    }
}
