package project.mentorship.projectmentorship.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum GrowthUnitsEnum {
    DRAGONFLY("Dragongflr"),
    ATLAS("Atlas"),
    VOYAGER("Voyager");

    private String value;

    public String getEnumByValue() {
        return value;
    }
}
