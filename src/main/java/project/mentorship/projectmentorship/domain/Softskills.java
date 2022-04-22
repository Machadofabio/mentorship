package project.mentorship.projectmentorship.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TCAD_SOFTSKILLS")
public class Softskills {

    @Id
    @Column(name = "ID_SOFTSKILL", nullable = false, length = 3)
    private Integer idSoftskill;

    @Column(name = "DESCRCAO", nullable = false)
    private String softskillDescription;

    @OneToMany(mappedBy = "softSkills")
    private List<MentorSoftSkills> mentorSoftSkills;
}
