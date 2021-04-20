package org.lsf.service;

import org.lsf.exception.UploadFailedException;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * 提供文件存储服务
 */

public interface StorageService {
    void init();

    void store(MultipartFile file) throws UploadFailedException;

    File load(String filename);

    Resource loadAsResource(String filename);

    void deleteAll();
}
