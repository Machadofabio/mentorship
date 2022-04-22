package project.mentorship.projectmentorship.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TCAD_MENTOR_HARDSKILLS")
public class MentorHardSkills {

    @Id
    private long id;

    @MapsId("idHardskill")
    @ManyToOne
    @JoinColumn(name = "ID_HARDSKILL")
    private Hardskills hardskills;

}
