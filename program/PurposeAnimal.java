package program;

public enum PurposeAnimal {
    PET("домашнее животное"), PACK("вьючное животное");

    private String type;

    PurposeAnimal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
