package com.zrf.picturebed.entity;

import com.zrf.picturebed.utils.Sex;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fafa
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private Integer id;

    private String name;

    private Sex sex;

    private String phone;
}
