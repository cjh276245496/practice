package com.ofzc.modules.tst.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: cjh27
 * @Date: 2019/2/20
 */
@Data
public class User implements Serializable {

    private Long id;
    private String name;
    private Integer age;

}
