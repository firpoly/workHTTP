package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Animal {

    public String id;
    public String text;
    public String type;
    public String user;
    public String upvotes ;

    public Animal(@JsonProperty("id") String id,
                  @JsonProperty("text") String text,
                  @JsonProperty("type") String type,
                  @JsonProperty("user") String user,
                  @JsonProperty("upvotes") String upvotes){

        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }
    public String getUpvotes() {
        return upvotes;
    }
    @Override
    public String toString() {
        return "animalId=" + id+
                "\n type=" + type +
                "\n user=" + user +
                "\n text=" + text +
                "\n upvotes=" + upvotes;
    }

}