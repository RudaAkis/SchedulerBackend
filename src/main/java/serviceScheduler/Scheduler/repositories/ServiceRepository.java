package serviceScheduler.Scheduler.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import serviceScheduler.Scheduler.entities.Service;

import java.util.UUID;

@Repository
public interface ServiceRepository extends JpaRepository<Service, UUID> {
}
