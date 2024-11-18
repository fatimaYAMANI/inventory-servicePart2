package ma.xproce.videoservice.web;

import ma.xproce.videoservice.dtos.VideoDto;
import ma.xproce.videoservice.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class VideoController {
    @Autowired
    private VideoService videoService;

    //getVideoById(id:ID):Video
    @QueryMapping
    public VideoDto getVideoById(@Argument long id){
        return videoService.getVideoById(id);
    }
}
