package serviceScheduler.Scheduler.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import serviceScheduler.Scheduler.entities.Specialist;

import java.util.UUID;

@Repository
public interface SpecialistRepository extends JpaRepository<Specialist, UUID > {
}
