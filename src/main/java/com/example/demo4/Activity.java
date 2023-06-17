package com.example.demo4;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@JsonSerialize
@Data
public class Activity {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("nazwa")
    private String name;
    @JsonProperty("sala")
    private Integer classroom;
    @JsonProperty("ects")
    private Integer ects;
    @JsonProperty("egzamin")
    private String exam;
}
