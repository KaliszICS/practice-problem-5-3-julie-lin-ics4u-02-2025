abstract class Animal {
    protected String name;
    protected int age;
    protected String type;
    protected int position;

    public Animal (String name, int age, String type, int position) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.position = position;
    }

    public String getName() {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getType() {
        return this.type;
    }

    public void setType (String type) {
        this.type = type;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition (int position) {
        this.position = position;
    }

    abstract String animalSound();

    abstract void move();

    public String sleep() {
        return "Zzz";
    }

}