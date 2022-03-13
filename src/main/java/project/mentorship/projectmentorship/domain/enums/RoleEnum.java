package project.mentorship.projectmentorship.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum RoleEnum {
    DEVELOPER_ANALIST("Analista de desenvolvimento"),
    SOFTWARE_ENGINEER("Engenheiro de software"),
    SOFTWARE_ARCHITECT("Arquiteto de software");

    private String value;

    public String getEnumByValue() {
        return value;
    }
}
