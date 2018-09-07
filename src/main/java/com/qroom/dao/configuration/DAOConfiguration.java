package com.qroom.dao.configuration;

import antlr.debug.MessageAdapter;
import com.qroom.dao.*;
import com.qroom.dao.entities.*;
import com.qroom.dao.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class DAOConfiguration {
    @Bean
    public DAOLogin daoLogin() {
        return new DAOLogin() {
            @Autowired
            LoginRepository loginRepository;

            @Autowired
            PersonRepository personRepository;

            @Override
            public boolean login(String login, String password) {
                return loginRepository.findById(login).orElse(null) != null &&
                        password.equals(loginRepository.findById(login).get().getPassword());
            }

            @Override
            public boolean register(String login, String password, String name, String surname, String email, String phone) {
                if(!loginRepository.existsById(login)) {
                    loginRepository.save(new Login(login, password));
                    long res = loginRepository.getIdByEmail(login);
                    personRepository.save(new Person(null, null, 0, null, res));
                    return true;
                }
                return false;
            }

            @Override
            public boolean register(String login, String password/*, String name, String surname, String email, String phone*/) {
                if(/*!loginRepository.existsById(login)*/true) {
                    loginRepository.save(new Login(login, password));
                    long res = loginRepository.getIdByEmail(login);
                    int s = 0;
                    personRepository.save(new Person(null, null, 0, null, res));
                    return true;
                }
                return false;
            }

            @Override
            public List<Person> test() {
                return  (List<Person>) personRepository.findAll();
                //return (List<Login>) loginRepository.findAll();
                //return null;
            }
        };
    }

    @Bean
    public DAOCourseView daoCourseView() {
        return new DAOCourseView(){
            //@Autowired
            NewsRepository newsRepository;

            //@Autowired
            CourseRepository courseRepository;

            //@Autowired
            StudyObjectRepository studyObjectRepository;

            @Override
            public Course getCourse(String code) {
                return courseRepository.getCourseInfo(code);
            }

            @Override
            public List<News> getNewsByCourse(long courseId) {
                return newsRepository.getNewsForCourse(courseId);
            }

            @Override
            public List<StudyObject> getContentsByCourse(long courseId) {
                return studyObjectRepository.getContentsByCourse(courseId);
            }

            @Override
            public StudyObject getContent(long id) {
                //return studyObjectRepository.findById(id).get();
                return null;
                /*List<StudyObject> list = studyObjectRepository.getContent(id);
                if(list.isEmpty()) {
                    return null;
                }
                return list.get(0);*/
            }

            @Override
            public News getNewsById(long id) {
                //return newsRepository.findById(id).get();
                return null;
            }
        };
    }

    @Bean
    public DAOFile daoFile() {
        return new DAOFile() {
            //@Autowired
            FileRepository fileRepository;

            @Override
            public File getFile(String hash) {
                List<File> list = fileRepository.getFileByHash(hash);
                if (list.isEmpty()) {
                    return null;
                }
                return list.get(0);
            }

            @Override
            public String save(MultipartFile file) throws IOException {
                byte[] bytes = file.getBytes();
                java.io.File dir = new java.io.File("files");
                if (!dir.exists())
                    dir.mkdirs();

                //--- сохранение в базу данных

                //---
                String name = ""; // хеш номера файла
                java.io.File serverFile = new java.io.File(dir.getAbsolutePath()
                        + java.io.File.separator + name);
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();
                return name;
            }

            @Override
            public boolean delete(String hash) {
                java.io.File file = new java.io.File("D:/" + hash);
                return file.delete();
            }
        };
    }

    @Bean
    public DAOMessage daoMessage() {
        return new DAOMessage() {
            //@Autowired
            MessageRepository messageRepository;

            @Override
            public List<Long> getMessages(long person, long course) {
                List<Long> list = new ArrayList<>();
                List<Message> messages = messageRepository.getMessages(person, course);
                for (Message m : messages) {
                    list.add(m.getMessage_id());
                }
                return list;
            }

            @Override
            public boolean sendMessage(Message message) {
                //messageRepository.save(message);
                return false;
            }

            @Override
            public Message getMessageById(long id) {
                //return messageRepository.findById(id).get();
                return null;
            }

            @Override
            public long getSender(long senderId) {
                return messageRepository.getSender(senderId);
            }
        };
    }

    @Bean
    DAOCourse daoCourse() {
        return new DAOCourse() {
            //@Autowired
            StudyObjectRepository studyObjectRepository;

            //@Autowired
            NewsRepository newsRepository;

            //@Autowired
            CourseRepository courseRepository;

            @Override
            public List<StudyObject> getAllStudyObject() {
                //return studyObjectRepository.findAll();
                return null;
            }

            @Override
            public List<Long> getNewsForCourse(long courseId) {
                List<Long> list = new ArrayList<>();
                List<News> news = newsRepository.getNewsForCourse(courseId);
                for (News n : news) {
                    list.add(n.getId());
                }
                return list;
            }

            @Override
            public Course getCourseByMessage(long messageId) {
                return courseRepository.getCourseByMessage(messageId);
            }
        };
    }

    @Bean
    DAOPerson daoPerson() {
        return new DAOPerson() {
            @Autowired
            PersonRepository personRepository;

            @Override
            public Person getPersonByLogin(String login) {
                return personRepository.getPersonByLogin(login);
            }

            @Override
            public boolean setName(long id, String name) {
                personRepository.setName(id, name);
                return true;
            }

            @Override
            public boolean setSurname(long id, String surname) {
                personRepository.setSurname(id, surname);
                return true;
            }

            @Override
            public boolean setIcon(long id, long icon) {
                personRepository.setIcon(id, icon);
                return true;
            }

            @Override
            public boolean setPhone(long id, String phone) {
                personRepository.setPhone(id, phone);
                return true;
            }

            @Override
            public String getIcon(long id) {
                return Long.toString(personRepository.getIcon(id));
            }
        };
    }

    @Bean
    DAOTeacher daoTeacher() {
        return new DAOTeacher() {
            //@Autowired
            TeacherRepository teacherRepository;

            @Override
            public long getTeacherByCourse(long courseId) {
                return teacherRepository.getTeacherByCourse(courseId);
            }
        };
    }
}
