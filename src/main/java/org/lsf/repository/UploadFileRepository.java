package org.lsf.repository;

import org.lsf.beans.UploadFile;

import java.util.List;

public interface UploadFileRepository {
    UploadFile findOneById(Integer id);

    List<UploadFile> findListByName(String name);
}
