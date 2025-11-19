public class Duck extends Animal{
  protected String beakColor = "Yellow";
  
  public Duck(){
    super();
  }
  
  public Duck(int age, String gender){
    super(age, gender);
  }
  
  public Duck(int age, String gender, String beakColor){
    super(age, gender);
    this.beakColor = beakColor;
  }
  
  public String getBeakColor(){
    return beakColor;
  }
  
  public void setBeakColor(String beakColor){
    this.beakColor = beakColor;
  }
  
  public void swim(){
    System.out.println("The Duck is swimming");
  }
  
  public void quack(){
    System.out.println("Quack! Quack!");
  }
  
  @Override
  public Boolean isMammal(){
    return false;
  }
  
  @Override
  public void mate(){
    System.out.println("This Duck is mating");
  }
  
  @Override
  public String toString(){
    return "Duck [age:" + age + ", gender:" + gender + ", beakColor:" + beakColor + ", isMammal" + isMammal() + "]";
  }
}