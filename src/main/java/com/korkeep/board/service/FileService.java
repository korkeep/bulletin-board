package com.korkeep.board.service;

import com.korkeep.board.domain.entity.File;
import com.korkeep.board.domain.repository.FileRepository;
import com.korkeep.board.dto.FileDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class FileService {
    private FileRepository fileRepository;

    public FileService(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Transactional
    public Long saveFile(FileDto fileDto) {
        return fileRepository.save(fileDto.toEntity()).getId();
    }

    @Transactional
    public FileDto getFile(Long id) {
        File file = fileRepository.findById(id).get();

        return FileDto.builder()
                .id(id)
                .fileName(file.getFileName())
                .filePath(file.getFilePath())
                .build();
    }
}
