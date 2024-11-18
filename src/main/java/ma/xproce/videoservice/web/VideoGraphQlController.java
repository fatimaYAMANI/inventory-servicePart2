package ma.xproce.videoservice.web;

import ma.xproce.videoservice.dao.entities.Creator;
import ma.xproce.videoservice.dao.entities.Video;
import ma.xproce.videoservice.dao.repositories.CreatorRepository;
import ma.xproce.videoservice.dao.repositories.VideoRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

//@Controller
public class VideoGraphQlController {

    private CreatorRepository creatorRepository;
    private VideoRepository videoRepository;

    VideoGraphQlController(CreatorRepository creatorRepository, VideoRepository videoRepository) {
        this.creatorRepository = creatorRepository;
        this.videoRepository = videoRepository;
    }

    @QueryMapping
    public List<Video> videoList() {
        return videoRepository.findAll();
    }


}