package program;

public enum PurposeAnimal {
    PET("домашнее животное"),
    PACK("вьючное животное");

    private String purpose;

    PurposeAnimal(String purpose) {this.purpose = purpose;}

    public String getPurpose() {return purpose;}

    public void setPurpose(String purpose) {this.purpose = purpose;}
}
