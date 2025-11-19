public class Zebra extends Animal{
  protected Boolean isWild;
  
  public Zebra(){
    super();
  }
  
  public Zebra(int age, String gender){
    super(age, gender);
  }
  
  public Zebra(int age, String gender, Boolean isWild){
    super(age, gender);
    this.isWild = isWild;
  }
  
  public Boolean getIsWild(){
    return true;
  }
  
  public void setIsWild(Boolean isWild){
    this.isWild = isWild;
  }
  
  public void run(){
    System.out.println("This Zebra is running");
  }
  
  public Boolean isMammal(){
    return true;
  }
  
  public void mate(){
    System.out.println("This Zebra is mating");
  }
  
  @Override
  public String toString(){
    return "Zebra [age:" + age + ", gender:" + gender + ", isWild:" + isWild + ", isMammal:" + isMammal() + "]";
  }
}