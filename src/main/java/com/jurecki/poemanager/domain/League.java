package com.jurecki.poemanager.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class League {

    @Id
    private String id;
    private String realm;
    private String description;
    private String registerAt;
    private String url;
    private String startAt;
    private String endAt = null;
    private Boolean delveEvent;

    @Lob
    private ArrayList<Rule> rules = new ArrayList<>();

    public League() {
    }


    @Override
    public String toString() {
        return "League{" +
                "id='" + id + '\'' +
                ", realm='" + realm + '\'' +
                ", description='" + description + '\'' +
                ", registerAt='" + registerAt + '\'' +
                ", url='" + url + '\'' +
                ", startAt='" + startAt + '\'' +
                ", endAt='" + endAt + '\'' +
                ", delveEvent=" + delveEvent +
                ", rules=" + rules +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegisterAt() {
        return registerAt;
    }

    public void setRegisterAt(String registerAt) {
        this.registerAt = registerAt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public Boolean getDelveEvent() {
        return delveEvent;
    }

    public void setDelveEvent(Boolean delveEvent) {
        this.delveEvent = delveEvent;
    }

    public ArrayList<Rule> getRules() {
        return rules;
    }

    public void setRules(ArrayList<Rule> rules) {
        this.rules = rules;
    }
}
