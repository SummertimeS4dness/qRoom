package com.qroom.controllers;

import com.qroom.controllers.answers.Answer;
import com.qroom.controllers.answers.ErrorAnswer;
import com.qroom.controllers.answers.templates.ActionServer;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@RestController
public class FileController {
    @RequestMapping(value = "/uploadFile", consumes = "multipart/form-data", headers = "content-type=multipart/*")
    public Answer uploadFile(@RequestParam("file") MultipartFile file) {
        final String command = "uploadFile";
        ActionServer actionServer = () -> {
            if (file.isEmpty()) {
                return new ErrorAnswer(command, "You failed to upload file because the file was empty.");
            } else {
                return null;
            }
        };
        return null;

    }
}
