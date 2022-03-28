package project.mentorship.projectmentorship.vo;

import project.mentorship.projectmentorship.domain.enums.GrowthUnitsEnum;
import project.mentorship.projectmentorship.domain.enums.RoleEnum;
import project.mentorship.projectmentorship.domain.enums.SeniorityEnum;

import java.util.Date;
import java.util.List;

public class MentorVo {
    private long id;
    private String name;
    private RoleEnum role;
    private SeniorityEnum seniority;
    private Date contractDate;
    private GrowthUnitsEnum growthUnit;
    private Boolean avaliable;
    private List<String> hardSkills;
    private List<String> softSkills;
}
