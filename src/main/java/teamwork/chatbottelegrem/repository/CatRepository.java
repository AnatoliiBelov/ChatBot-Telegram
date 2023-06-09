package teamwork.chatbottelegrem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teamwork.chatbottelegrem.model.Cat;
/**
 * Репозиторий класса кота
 */
@Repository
public interface CatRepository extends JpaRepository<Cat, Long>  {
}
