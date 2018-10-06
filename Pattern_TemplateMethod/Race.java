package Patterns.Pattern_TemplateMethod;

abstract public class Race {
    //Template method set to 'final', as result subclasses can't overwrite it
    //Parts of template method implemented in a Base-class and remaining parts should be defined in subclasses
    final void createBuilding(){
        System.out.println(this.getClass().getSimpleName() + " starts building");
        //to define behavior in subclass
        move();
        useGas();
        useMinerals();
        //to define behavior in subclass
        build();
    }

    abstract void move();

    final void useMinerals(){
        System.out.println("Using minerals for building");
    }

    final void useGas(){
        System.out.println("Use Gas for building");
    }

    abstract void build();
}
