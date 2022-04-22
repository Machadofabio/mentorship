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
@Table(name = "TCAD_MENTOR_SOFTSKILLS")
public class MentorSoftSkills {

    @Id
    private long id;

    @MapsId("idSoftskill")
    @ManyToOne
    @JoinColumn(name = "ID_SOFTSKILL")
    private Softskills softSkills;
}
