package com.qroom.controllers;

import com.qroom.controllers.answers.Answer;
import com.qroom.controllers.answers.ErrorAnswer;
import com.qroom.controllers.answers.SuccessAnswer;
import com.qroom.dao.entities.Question;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {



    @RequestMapping("/startTest")
    public Answer startTest(@RequestParam("id") long id, HttpSession session) {
        final String command = "startTest";
        if (true) // check option start test
        {
            //
            session.setAttribute("test_" + id, 0);
            return new SuccessAnswer<>(command, null, true);
        } else {
            return new ErrorAnswer(command, null);
        }
    }

    @RequestMapping("/question")
    public Answer question(@RequestParam("id") long id, long test, HttpSession session) {
        final String command = "nextQuestion";
        Integer s = (Integer) session.getAttribute("test_" + id);
        if (s == null) {
            return new ErrorAnswer(command, "Test open error");
        } else if (s.equals(-1)) {
            return new SuccessAnswer<>(command, null, "test_end");
        } else {
            session.setAttribute("test_" + id, id);
            Question question = null;
            return new SuccessAnswer<>(command, null, question);
        }
    }



}
