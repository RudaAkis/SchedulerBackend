package serviceScheduler.Scheduler.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalTime;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Data
@AllArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private ServiceWIthSpecialist serviceWIthSpecialist;

    private LocalTime startTime;

    private Integer durationInMinutes;

    private User user;

    private AppointmentStatus appointmentStatus;


}
