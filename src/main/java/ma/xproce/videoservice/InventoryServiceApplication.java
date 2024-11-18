package ma.xproce.videoservice;

import ma.xproce.videoservice.dao.entities.Creator;
import ma.xproce.videoservice.dao.entities.Video;
import ma.xproce.videoservice.dao.repositories.CreatorRepository;
import ma.xproce.videoservice.dao.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CreatorRepository creatorRepository, VideoRepository videoRepository) {
        return args -> {
            List<Creator> creators = List.of(
                    Creator.builder().name("John Doe").email("johndoe@example.com").build(),
                    Creator.builder().name("Jane Smith").email("janesmith@example.com").build()
            );
            creatorRepository.saveAll(creators);

            List<Video> videos = List.of(
                    Video.builder().name("Intro to Java").url("http://example.com/java").description("Java basics").datePublication(new Date()).creator(creators.get(0)).build(),
                    Video.builder().name("Spring Boot Guide").url("http://example.com/spring").description("Guide to Spring Boot").datePublication(new Date()).creator(creators.get(1)).build()
            );
            videoRepository.saveAll(videos);
        };
    }

}
