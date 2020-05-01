package com.xiaosong456.springcloud.entities.payment;

import java.io.Serializable;

/**
 * (Payment)实体类
 *
 * @author makejava
 * @since 2020-04-29 11:54:18
 */
public class Payment implements Serializable {

    private static final long serialVersionUID = 791189595103648506L;
    /**
    * ID
    */
    private Long id;
    
    private String serial;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

}