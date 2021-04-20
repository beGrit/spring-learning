package org.lsf.service.impl;

import org.lsf.exception.StorageFileNotFoundException;
import org.lsf.exception.UploadFailedException;
import org.lsf.service.StorageService;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

//@Service
public class MongoStorageServiceImpl implements StorageService {
    @Override
    public void init() {

    }

    @Override
    public void store(MultipartFile file) throws UploadFailedException {
        // 存储到 MongoDB 中


        throw new UploadFailedException();
    }

    @Override
    public File load(String filename) {
        return null;
    }

    @Override
    public Resource loadAsResource(String filename) {
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
