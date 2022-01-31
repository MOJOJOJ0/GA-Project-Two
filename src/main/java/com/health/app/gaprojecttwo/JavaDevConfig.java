package com.health.app.gaprojecttwo;


        import org.springframework.context.annotation.Configuration;
        import org.springframework.context.annotation.Profile;

        import javax.annotation.PostConstruct;

@Profile("dev")
@Configuration
public class JavaDevConfig {
    @PostConstruct
    public void test(){
        System.out.println("Loading dev profile");
    }
}