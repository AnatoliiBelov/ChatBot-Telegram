package teamwork.chatbottelegrem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teamwork.chatbottelegrem.Model.Dog;
@Repository
public interface DogRepository  extends JpaRepository<Dog, Long> {
}