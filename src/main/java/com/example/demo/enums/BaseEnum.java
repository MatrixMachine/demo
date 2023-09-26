package com.example.demo.enums;

/**
 * @author kermit.mo
 */
public interface BaseEnum<T extends Enum<T> & BaseEnum<T>> {
    String getCode();

    String getName();

    static <T extends Enum<T> & BaseEnum<T>> T parseByCode(Class<T> cls, String code) {
        T[] enumConstants = cls.getEnumConstants();
        for (T t : enumConstants) {
            if (t.getCode().equals(code)){
                return t;
            }
        }
        return null;
    }
}
