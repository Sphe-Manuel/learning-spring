package com.sphesihle.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.UUID;

@Getter
@NoArgsConstructor
@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid" , strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id" , updatable = false , nullable = false, columnDefinition = "BINARY(16)")
    private UUID id;

    @Column(name = "name" , nullable = false)
    private String name ;

    @Column(name = "age")
    private int age ;


}
