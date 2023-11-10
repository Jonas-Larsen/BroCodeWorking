package Interface;

public class InterfaceRabbit implements InterfacePrey {
    @Override
    public void flee() {
        System.out.println("*The rabbit is fleeing* ");
    }
}
