package Pillars.Inheritance;

class Parent {
    String eyeColor = "Brown";
    String skinTone = "Fair";

    void showTraits() {
        System.out.println("Eye Color: " + eyeColor);
        System.out.println("Skin Tone: " + skinTone);
    }

    void gesture() {
        System.out.println("Parent often smiles while speaking.");
    }
}

class Child extends Parent {
    String hairType = "Curly";

    void showChildTraits() {
        showTraits(); // calling parent’s method
        System.out.println("Hair Type: " + hairType);
    }

    @Override
    void gesture() {
        System.out.println("Child waves hands while speaking.");
    }
}


class InheritanceDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.showChildTraits();
        child.gesture();
    }
}

