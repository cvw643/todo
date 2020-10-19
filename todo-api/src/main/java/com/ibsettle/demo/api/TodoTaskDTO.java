package com.ibsettle.demo.api;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class TodoTaskDTO {
    private int id;
    @NotBlank
    private String subject;
    private String description;
    private Date createdAt;
}
