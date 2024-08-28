package com.FileUpload.DemoFileUpload.common;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FileStorageException extends RuntimeException {

    private String msg;

    public FileStorageException(String msg) {
        this.msg = msg;
    }

}

