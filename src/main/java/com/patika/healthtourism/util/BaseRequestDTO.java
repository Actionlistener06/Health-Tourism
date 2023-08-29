package com.patika.healthtourism.util;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.UUID;

public class BaseRequestDTO {
    private Long id;
    private UUID uuid;
    @JsonIgnore
    private Date creationDate;
    @JsonIgnore
    private Date updatedDate;
}
