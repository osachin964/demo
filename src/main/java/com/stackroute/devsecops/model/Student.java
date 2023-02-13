package com.stackroute.devsecops.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
   @Id
    private int rollNo;
    private String name;

}
