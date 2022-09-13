package com.zrf.picturebed.entity;

import com.zrf.picturebed.utils.Sex;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.lang.Nullable;

import javax.persistence.*;

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

    @Enumerated(EnumType.ORDINAL)
    private Sex sex;

    private String phone;
}
