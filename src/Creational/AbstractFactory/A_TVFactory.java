package Creational.AbstractFactory;

public class A_TVFactory implements TVFactory {
    @Override
    public Product getProduct() {
        return new ProductA();
    }

    @Override
    public Sound getSound() {
        return new SoundA();
    }
}
