package serviceScheduler.Scheduler.entities;


import jakarta.persistence.Entity;
import lombok.*;

import java.util.UUID;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Service {

    private UUID serviceId;

    private String name;

    private Category category;
}
