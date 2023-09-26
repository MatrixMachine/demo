package com.example.demo.enums;

/**
 * @author kermit.mo
 */
public enum BizEnum implements BaseEnum<BizEnum> {
    ACTIVITY("activity","activity"),
    ;
    private String code;

    private String name;

    BizEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }


    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
