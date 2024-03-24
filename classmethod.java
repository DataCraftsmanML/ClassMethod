public class classmethod {
  
  static void myStaticMethod() {
    System.out.println("jia");
  }

  public void myPublicMethod() {
    System.out.println("meera");
  }
  public static void main(String[] args) {

    myStaticMethod(); 

    classmethod myObj = new classmethod();

    myObj.myPublicMethod(); 
  }
}
