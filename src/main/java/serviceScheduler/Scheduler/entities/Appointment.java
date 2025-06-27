package serviceScheduler.Scheduler.entities;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Data
@AllArgsConstructor
public class Appointment {

    private ServiceWIthSpecialist serviceWIthSpecialist;

    private LocalTime startTime;

    private Integer durationInMinutes;

    private User user;

    private AppointmentStatus appointmentStatus;


}
