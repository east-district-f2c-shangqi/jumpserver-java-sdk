package com.jumpserver.sdk.v2.model;

/**
 * @author : Anneit
 * @version V1.0
 * @Project: jumpserver-sdk3
 * @Package com.jumpserver.sdk.v2.model
 * @Date : 2023年06月02日 上午10:48
 */

public class BaseDto {

    private String label;

    private String value;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
