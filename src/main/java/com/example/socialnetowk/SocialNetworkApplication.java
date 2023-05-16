package com.example.socialnetowk;
import com.example.socialnetowk.entity.Student;
import com.example.socialnetowk.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocialNetworkApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SocialNetworkApplication.class, args);
    }


    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
      /*  Student student = new Student("Azamat","Torogeldiev","torogeldiev.aza@gmail.com");
        studentRepository.save(student);

        Student student2 = new Student("Tilek","Torogeldiev","tilek2402@gmail.com");
        studentRepository.save(student2);

        Student student3 = new Student("HUi","HUi","tony@gmail.com");
        studentRepository.save(student3); */
    }
}
