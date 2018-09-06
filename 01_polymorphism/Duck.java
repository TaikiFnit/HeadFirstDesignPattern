public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() {

  }

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();  // 振る舞いクラスに処理を移譲
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("All かも can floating on water. even おとりのかも!");
  }
}
