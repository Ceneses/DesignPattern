package Creational.AbstractFactory;

public class B_TVFactory implements TVFactory {
    @Override
    public Product getProduct() {
        return new ProductB();
    }

    @Override
    public Sound getSound() {
        return new SoundB();
    }
}
