package com.cool.amoy.demo.shiro.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "tb_user")
@Entity
public class User implements Serializable {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    private String id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
    /**
     * 0，null为启用，1为禁用
     */
    @Column(name = "enable")
    private Integer enable;
}
