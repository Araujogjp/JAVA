public interface Animal {
    void emitirSom();
    void mover();
}


public class Cachorro implements Animal {
    
    @Override
    public void emitirSom(){
        System.out.println("Au Au");
    }
    
    @Override
    public void mover(){
        System.out.println("Cachorro deu 5 passos");
    }
}


public class Gato implements Animal{
    
    @Override
    public void emitirSom(){
        System.out.println("Miau Miau");
    }
    
    @Override
    public void mover(){
        System.out.println("Gato deu 5 passos");
    }
}

public class Passaro implements Animal {
    
    @Override
    public void emitirSom(){
        System.out.println("Piu Piu");
    }
    @Override
    public void mover(){
        System.out.println("Passaro voou");
    }
}

public class Main {

    public static void main(String[] args) {
       
        Animal[] a = new Animal[3];
        a[0] = new Cachorro();
        a[1] = new Gato();
        a[2] = new Passaro();
        
        for (Animal animal : a) {
            animal.emitirSom();
            animal.mover();
            System.out.println("\n");
        }
    }
}
