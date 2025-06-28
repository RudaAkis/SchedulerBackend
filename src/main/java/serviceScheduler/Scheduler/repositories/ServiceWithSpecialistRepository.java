package serviceScheduler.Scheduler.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import serviceScheduler.Scheduler.entities.ServiceWIthSpecialist;
import serviceScheduler.Scheduler.entities.ServiceWithSpecialistId;

@Repository
public interface ServiceWithSpecialistRepository extends JpaRepository<ServiceWIthSpecialist, ServiceWithSpecialistId> {
}
