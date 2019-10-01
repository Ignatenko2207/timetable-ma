package com.mainacad.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "admins")
public class Admin extends User {

    @Column(name = "user_role")
    private UserRole userRole = UserRole.ADMIN;
}
