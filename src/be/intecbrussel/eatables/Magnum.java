package be.intecbrussel.eatables;

import be.intecbrussel.sellers.IceCreamSeller;

public class Magnum implements Eatable{

    public MagnumType type;
    public Magnum(){

    }

    public Magnum(MagnumType type) {
        this.type=type;
    }

    public void eat() {
        if (this.type != null){
            this.type = MagnumType.valueOf(getType().name());
        }
        System.out.println("Eating a delicious " + getType());
    }
    public MagnumType getType() {
        return type;
    }


    public enum MagnumType {
        MILKCHOCOLATE,
        WHITECHOCOLATE,
        BLACKCHOCOLATE,
        ALPNENUTS,
        ROMANTICSTRAWBERRIES

    }
}
