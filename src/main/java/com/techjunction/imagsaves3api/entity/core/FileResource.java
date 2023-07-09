package com.techjunction.imagsaves3api.entity.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.sql.Blob;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FileResource {
    private Blob hash;
    private Blob fileName;
    private Blob fileResourceUrl;
    private String directory;
}
