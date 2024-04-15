package simulator;

import org.junit.jupiter.api.Test;

import simulator.fly.FlyNoWay;

import static org.mockito.Mockito.*;

public class DuckTest {

//     @Test
//     public void flyTest() {
//         // Mock System.out
//         System.setOut(mock(java.io.PrintStream.class));

//         FlyNoWay flyNoWay = new FlyNoWay();
//         flyNoWay.fly();

//         // Verificar que se haya llamado System.out.println con el mensaje esperado
//         verify(System.out).println("I can't fly");
//     }

    @Test
    public void quackTest() {
        Duck duck = new ModelDuck();
        duck.flyBehavior.fly();;
        duck.quackBehavior.quack();
    }

    @Test
    public void duckMallardTest() {
        Duck duck = new MallardDuck();
        duck.flyBehavior.fly();
        duck.quackBehavior.quack();
    }



}

