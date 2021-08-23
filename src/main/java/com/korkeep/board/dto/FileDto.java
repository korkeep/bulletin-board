package com.korkeep.board.dto;

import com.korkeep.board.domain.entity.File;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class FileDto {
    private Long id;
    private String fileName;
    private String filePath;

    public File toEntity() {
        return File.builder()
                .id(id)
                .fileName(fileName)
                .filePath(filePath)
                .build();
    }

    @Builder
    public FileDto(Long id, String fileName, String filePath) {
        this.id = id;
        this.fileName = fileName;
        this.filePath = filePath;
    }
}
