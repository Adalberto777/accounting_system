package program;

import lombok.Data;

import java.time.LocalDate;
import java.time.Period;

@Data
public class Animal {
    private String name;
    private LocalDate dob;
    private TypeAnimal type;
    private PurposeAnimal purpose;

    public Animal(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public TypeAnimal getType() {
        return type;
    }

    public void setType(TypeAnimal type) {
        this.type = type;
    }

    public PurposeAnimal getPurpose() {
        return purpose;
    }

    public void setPurpose(PurposeAnimal purpose) {
        this.purpose = purpose;
    }

    public int getAge(LocalDate dob, LocalDate currentDate) {
        if ((dob != null) && (currentDate != null)) {
            return Period.between(dob, currentDate).getYears();
        } else {
            return 0;
        }
    }


}
