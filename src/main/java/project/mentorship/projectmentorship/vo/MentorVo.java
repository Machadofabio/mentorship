package project.mentorship.projectmentorship.vo;

import lombok.Data;
import project.mentorship.projectmentorship.domain.enums.GrowthUnitsEnum;
import project.mentorship.projectmentorship.domain.enums.RoleEnum;
import project.mentorship.projectmentorship.domain.enums.SeniorityEnum;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class MentorVo {
    private long id;
    private String name;
    private String role;
    private String seniority;
    private ZonedDateTime contractDate;
    private String growthUnit;
    private Boolean isAvaliable;
    private List<String> hardSkills;
    private List<String> softSkills;
}
