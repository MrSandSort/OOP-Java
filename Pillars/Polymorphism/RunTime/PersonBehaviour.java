package Pillars.Polymorphism.RunTime;

class Person {
    void behave() {
        System.out.println("Person behaves in a general way.");
    }
}

class Home extends Person {
    @Override
    void behave() {
        System.out.println("At home, the person relaxes and spends time with family.");
    }
}

class Office extends Person {
    @Override
    void behave() {
        System.out.println("At the office, the person works and attends meetings.");
    }
}

class College extends Person {
    @Override
    void behave() {
        System.out.println("At college, the person studies and become attentive in class.");
    }
}

class Friend extends Person {
    @Override
    void behave() {
        System.out.println("With friends, the person jokes and has fun.");
    }
}

class OverrideTest {
    public static void main(String[] args) {
        Person p;

        p = new Home();
        p.behave();

        p = new Office();
        p.behave();

        p = new College();
        p.behave();

        p = new Friend();
        p.behave();
    }
}
