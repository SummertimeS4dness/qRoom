package com.qroom.controllers;

import com.qroom.controllers.answers.Answer;
import com.qroom.controllers.answers.ErrorAnswer;
import com.qroom.controllers.answers.SuccessAnswer;
import com.qroom.controllers.answers.templates.ActionServer;
import com.qroom.controllers.answers.templates.AuthorizationTemplate;
import com.qroom.dao.DAOFile;
import com.qroom.dao.DAOLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
public class FileController {

    @Autowired
    private DAOFile daoFile;

    @Autowired
    private DAOLogin daoLogin;

    @RequestMapping(value = "/uploadFile", consumes = "multipart/form-data", headers = "content-type=multipart/*")
    public Answer uploadFile(@RequestParam("file") MultipartFile file, HttpSession session) {
        final String command = "uploadFile";
        ActionServer actionServer = () -> {
            if (file.isEmpty()) {
                return new ErrorAnswer(command, "You failed to upload file because the file was empty.");
            } else {
                try {
                    String name = daoFile.save(file);
                    return new SuccessAnswer<>(command, "File was uploaded successful", name);
                } catch (IOException e) {
                    return new ErrorAnswer(command, "Error in writing file");
                }
            }
        };
        return new AuthorizationTemplate(actionServer, session, command, daoLogin).answer();

    }
}
