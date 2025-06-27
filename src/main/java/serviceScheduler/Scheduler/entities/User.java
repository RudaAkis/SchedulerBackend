package serviceScheduler.Scheduler.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Data
@AllArgsConstructor
public class User {

    @OneToOne
    private UserAccount userAccount;

    //Holds the booking
    @ManyToMany
    private List<Appointment> appointments;


}
