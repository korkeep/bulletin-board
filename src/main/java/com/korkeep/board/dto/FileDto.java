package com.korkeep.board.dto;

import com.korkeep.board.domain.entity.File;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class FileDto {
    private Long id;
    private String origFileName;
    private String fileName;
    private String filePath;

    public File toEntity() {
        return File.builder()
                .id(id)
                .origFileName(origFileName)
                .fileName(fileName)
                .filePath(filePath)
                .build();
    }

    @Builder
    public FileDto(Long id, String origFileName, String fileName, String filePath) {
        this.id = id;
        this.origFileName = origFileName;
        this.fileName = fileName;
        this.filePath = filePath;
    }
}
