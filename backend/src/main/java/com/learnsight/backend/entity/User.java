package com.learnsight.backend.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  Long id;

  @Column(name = "username", nullable = false, unique = true)
  String username;

  @Column(name = "email", nullable = false, unique = true)
  String email;

  @Column(name = "password", nullable = false)
  String password;

  @Column(name = "full_name")
  String fullName;

  @Column(name = "phone_number")
  String phoneNumber;

  @Column(name = "status")
  int status;

  @CreationTimestamp
  @Column(name = "created_at")
  LocalDateTime createdAt;

  @CreationTimestamp
  @Column(name = "updated_at")
  LocalDateTime updatedAt;

  @Column(name = "img_path")
  String imagePath;

  @Column(name = "address")
  String address;
}
