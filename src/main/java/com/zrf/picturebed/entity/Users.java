package com.zrf.picturebed.entity;

import com.zrf.picturebed.utils.Sex;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author fafa
 * @version 1.0
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    private Integer id;

    private String name;

    private Sex sex;

    private String phone;
}
