package serviceScheduler.Scheduler.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import serviceScheduler.Scheduler.entities.SpecialistSchedule;

import java.util.UUID;

@Repository
public interface SpecialistScheduleRepository extends JpaRepository<SpecialistSchedule, UUID> {
}
