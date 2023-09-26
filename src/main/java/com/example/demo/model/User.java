package com.example.demo.model;

import lombok.Data;

import java.util.Date;

/**
 * @author kermit.mo
 */
@Data
public class User {
    private Integer userId;
    private Date registerTime;
}
