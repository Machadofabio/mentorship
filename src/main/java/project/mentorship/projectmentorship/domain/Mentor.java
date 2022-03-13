package project.mentorship.projectmentorship.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.mentorship.projectmentorship.domain.enums.GrowthUnitsEnum;
import project.mentorship.projectmentorship.domain.enums.RoleEnum;
import project.mentorship.projectmentorship.domain.enums.SeniorityEnum;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private RoleEnum role;
    private SeniorityEnum seniority;
    private Date contractDate;
    private GrowthUnitsEnum growthUnit;


}
