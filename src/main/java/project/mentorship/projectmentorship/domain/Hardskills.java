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
@Table(name = "TCAD_HARDSKILLS")
public class Hardskills {

    @Id
    @Column(name = "ID_HARDSKILL", nullable = false, length = 3)
    private Integer idHardskill;

    @Column(name = "DESCRCAO", nullable = false)
    private String hardskillDescription;

    @OneToMany(mappedBy = "hardskills")
    private List<MentorHardSkills> mentorHardSkills;
}
