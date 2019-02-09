package com.mygroup.springbootcourse.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public class CourseDTO {
//JSON build
    private Long id;
    private String name;
    private int lengthInSecond;

}
