package com.baotruongtuan.RdpServer.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity(name = "reports")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "create_date")
    Date createDate;

    @Column(name = "image")
    String image;

    @Column(name = "description")
    String description;

    @JoinColumn(name = "user_id")
    @ManyToOne
    User user;
}
