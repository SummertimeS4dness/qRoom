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

        };
        if (!file.isEmpty()) {
            try {



                // Create the file on server



                return "You successfully uploaded file=" + name;
            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + name
                    + " because the file was empty.";
        }
    }
}
