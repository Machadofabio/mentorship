package project.mentorship.projectmentorship.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TCAD_MENTOR")
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ROLE")
    private String role;

    @Column(name = "SENIORITY")
    private String seniority;

    @Column(name = "CONTRACT_DATE")
    private ZonedDateTime contractDate;

    @Column(name = "GROWTH_UNIT")
    private String growthUnit;

}
