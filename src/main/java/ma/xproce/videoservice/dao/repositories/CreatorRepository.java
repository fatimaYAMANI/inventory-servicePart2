package ma.xproce.videoservice.dao.repositories;

import ma.xproce.videoservice.dao.entities.Creator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatorRepository extends JpaRepository<Creator, Long> {
}
