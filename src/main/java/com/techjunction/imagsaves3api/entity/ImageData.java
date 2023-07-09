package com.techjunction.imagsaves3api.entity;

import com.techjunction.imagsaves3api.entity.core.FileResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "image_data")
public class ImageData {
    @Id
    @Column(length = 80,name = "id")
    private String id;

    @Embedded
    private FileResource fileResource;

}
