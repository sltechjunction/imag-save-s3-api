package com.techjunction.imagsaves3api.dto;

import com.techjunction.imagsaves3api.entity.core.FileResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class ImageDataDTO {
    private String id;
    private FileResource fileResource;
}
