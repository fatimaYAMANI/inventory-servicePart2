package ma.xproce.videoservice.dtos;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import ma.xproce.videoservice.dao.entities.Video;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class CreatorDto {
    private String name;
    private String email;

    @OneToMany(mappedBy = "creator")
    private List<VideoDto> videos;
}
