package com.crearly.mssavetravel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "travels")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tavel")
    private Integer id;
    @Column(name = "id_user")
    private Integer idUser;
    @Column(name = "url_travel")
    private String urlTravel;
}
