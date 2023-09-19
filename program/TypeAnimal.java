package program;

public enum TypeAnimal {
    DOG ("Собака"),
    CAT ("Кошка"),
    HAMSTER ("Хомяк"),
    HORSE ("Лошадь"),
    CAMEL ("Верблюд"),
    DONKEY ("Осёл");

    private String type;

    TypeAnimal(String type) {this.type = type;}

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}
}
