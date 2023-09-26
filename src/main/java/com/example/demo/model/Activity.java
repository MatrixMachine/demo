package com.example.demo.model;

import lombok.Data;

import java.util.Date;

/**
 * @author kermit.mo
 */
@Data
public class Activity {
    private Integer activityId;

    private String activityName;

    private Date startTime;

    private Date endTime;
}
