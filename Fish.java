public class Fish extends Animal{
  private int sizeInFt;
  private Boolean canEat;
  
  public Fish(){
    super();
  }
  
  public Fish(int age, String gender){
    super(age, gender);
  }
  
  public Fish(int age, String gender, int sizeInFt, Boolean canEat){
    super(age, gender);
    this.sizeInFt = sizeInFt;
    this.canEat = canEat;
  }
  
  public int getSizeInFt(){
    return sizeInFt;
  }
  
  public void setSizeInFt(int sizeInFt){
    this.sizeInFt = sizeInFt;
  }
  
  public Boolean getCanEat(){
    return canEat;
  }
  
  public void setCanEat(Boolean canEat){
    this.canEat = canEat;
  }
  
  public void swim(){
    System.out.println("This fish is swimming");
  }
  
  public Boolean isMammal(){
    return false;
  }
  
  public void mate(){
    System.out.println("This fish is mating");
  }
  
  @Override
  public String toString(){
    return "Fish [age:" + age + ", gender:" + gender + ", sizeInFt:" + sizeInFt + ", canEat:" + canEat + ", isMammal:" + isMammal() + "]";
  }
}