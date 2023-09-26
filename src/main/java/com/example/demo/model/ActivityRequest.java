package com.example.demo.model;

import com.example.demo.enums.BizEnum;
import lombok.Data;

/**
 * @author kermit.mo
 */
@Data
public class ActivityRequest {
    /**
     * 业务code
     */
    private BizEnum bizEnum;

    private Integer userId;

    private Integer optPlaceId;

    private Integer activityId;

}
