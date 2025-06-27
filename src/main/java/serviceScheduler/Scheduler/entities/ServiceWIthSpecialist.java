package serviceScheduler.Scheduler.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//Specialist will create the Service with specialist
//Then user will be able to see the Services being offered by specialist
//The availability should then be received from the SpecialistSchedule in specialist
// excluding all of the times that are already booked which will be calculated from the Appointment start time
// and duration in Minutes from this Service with specialist
public class ServiceWIthSpecialist {

    private Service service;

    private Specialist specialist;

    private Integer durationInMinutes;

    private Double price;

    private boolean isActive;//Is the service currently being offered by the Specialist
}
