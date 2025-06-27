package serviceScheduler.Scheduler.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Specialist {

    @OneToOne
    private UserAccount userAccount;

    //Holds the services specialist offers and the schedules the user has

    private List<Service> servicesOffered;

    private List<SpecialistSchedule> specialistSchedules = new ArrayList<>();
}
