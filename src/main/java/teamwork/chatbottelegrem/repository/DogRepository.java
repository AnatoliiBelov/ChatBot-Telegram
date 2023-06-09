package teamwork.chatbottelegrem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teamwork.chatbottelegrem.model.Dog;
/**
 * Репозиторий класса собаки
 */
@Repository
public interface DogRepository  extends JpaRepository<Dog, Long> {
}
