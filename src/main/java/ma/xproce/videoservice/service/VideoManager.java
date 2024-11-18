package ma.xproce.videoservice.service;

import ma.xproce.videoservice.dao.entities.Video;
import ma.xproce.videoservice.dao.repositories.VideoRepository;
import ma.xproce.videoservice.dtos.VideoDto;
import ma.xproce.videoservice.mappers.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoManager implements VideoService{

    @Autowired
    private VideoRepository videoRepository;

    private VideoMapper videoMapper= new VideoMapper();

    @Override
    public VideoDto getVideoById(Long id) {
        Video video= videoRepository.findById(id).get();

        return videoMapper.FromVideoToVideoDto(video);
    }
}
