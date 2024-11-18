package ma.xproce.videoservice.dtos;

import jakarta.persistence.ManyToOne;
import lombok.*;
import ma.xproce.videoservice.dao.entities.Creator;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class VideoDto {

    private String name;
    private String url;
    private String description;
    private String datePublication; //pas de type Date dans GraphQl (scalar type)

    @ManyToOne
    private CreatorDto creator;
}
