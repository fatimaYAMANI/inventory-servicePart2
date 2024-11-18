package ma.xproce.videoservice.mappers;

import ma.xproce.videoservice.dao.entities.Video;
import ma.xproce.videoservice.dtos.VideoDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;

@Controller
public class VideoMapper {
    ModelMapper modelMapper= new ModelMapper();

    public VideoDto FromVideoToVideoDto(Video video) {
        return  modelMapper.map(video, VideoDto.class);
    }

    public Video FromVideoDtoToVideo(VideoDto dto) {
        return modelMapper.map(dto, Video.class);
    }
}
