package oops;

public class demo {

    public static void main(String[] args) {

        dog obj = new dog();

        obj.play();
        obj.eat();

        pet.prey();
    }
}

interface animal {

    void play();
}

interface pet {

    void eat();

    static void prey() {
        System.out.println("pet prey");
    }
}

class dog implements pet, animal {

    @Override
    public void play() {
        System.out.println("dog plays");
    }

    @Override
    public void eat() {
        System.out.println("dog eats");
    }
}