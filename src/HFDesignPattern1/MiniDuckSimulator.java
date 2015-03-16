package HFDesignPattern1;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPower());

		modelDuck.performFly();
		modelDuck.performQuack();
	}

}
