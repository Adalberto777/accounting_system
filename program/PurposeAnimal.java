package program;

public enum PurposeAnimal {
    PET("домашнее животное"), PACK("вьючное животное");

    private final String russianPurposeAnimalTitle;
    PurposeAnimal(String russianPurposeAnimalTitle){
        this.russianPurposeAnimalTitle = russianPurposeAnimalTitle;
    }

    public String getRussianPurposeAnimalTitle(){
        return russianPurposeAnimalTitle;
    }

    @Override
    public String toString() {
        return name();
    }
}
