package com.janki.jobpost.jobpost.models;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "jobpost")
public class Post {
    @Override
    public String toString() {
        return "Post{" +
                "profile='" + profile + '\'' +
                ", description='" + description + '\'' +
                ", experience=" + experience +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }

    private String profile;
    private  String description;
    private int experience;

    private String techs[];

}
