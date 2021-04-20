package org.lsf.service.impl;

import org.lsf.exception.UploadFailedException;
import org.lsf.service.StorageService;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Service
public class FileStorageServiceImpl implements StorageService {
    private BufferedOutputStream des;
    private String dir = "/home/lsf/IdeaProjects/spring/src/main/resources/imgs";
    private String filename;

    public FileStorageServiceImpl() {
        init();
    }

    @Override
    public void init() {
    }

    @Override
    public void store(MultipartFile file) throws UploadFailedException {
        // 打开 文件输出(out)流
        try {
            this.filename = this.dir + File.separator + file.getOriginalFilename();
            File file_path = new File(filename);
            if (!file_path.exists()) {
                try {
                    file_path.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            des = new BufferedOutputStream(new FileOutputStream(file_path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            int d;
            InputStream source = file.getInputStream();
            while ((d = source.read()) != -1) {
                des.write(d);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
