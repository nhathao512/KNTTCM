public abstract class Animal{
  protected int age;
  protected String gender;
  
  public Animal(){
    this.age = 0;
    this.gender = "unknown";
  }
  
  public Animal(int age, String gender){
    this.age = age;
    this.gender = gender;
  }
  
  public int getAge(){
    return age;
  }
  
  public void setAge(int age){
    this.age = age;
  }
  
  public String getGender(){
    return gender;
  }
  
  public void setGender(String gender){
    this.gender = gender;
  }
  
  public abstract Boolean isMammal();
  public abstract void mate();
  
  @Override
  public String toString(){
    return "Animal [age" + age + ", gender" + gender + "]";
  }
}