package serviceScheduler.Scheduler.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class ServiceWithSpecialistId implements Serializable {

    private UUID serviceId;

    private UUID specialistId;
}
