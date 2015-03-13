
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck(){};
	
	public void performFly(){
		flyBehavior.fly();
	};
	
	public void performQuack(){
		quackBehavior.quack();
	};
	
	public abstract void display();
}
