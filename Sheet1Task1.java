package tasks;

public class Sheet1Task1  {

  public static void main(String[] args) {
      /* System.out.println("Hallo " + args[0]  + "!"); */
      
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c = Integer.parseInt(args[2]);
      
      switch (c){
          case 1: {System.out.println(a + "+" + b + "=" + (a + b)); break;}
          case 2: {System.out.println(a + "-" + b + "=" + (a - b)); break;}
          case 3: {System.out.println(a + "*" + b + "=" + (a * b)); break;}
          case 4: {if(b == 0) {System.out.println("Achtung, der Nenner darf nicht Null sein.");
                              break;}
                  else{System.out.println(a + ":" + b + "=" + (a / b)); break;}}
          default: {System.out.println("Bitte geben sie für Addition eine 1, Subtraktion eine 2, Multiplikation eine 3, Quotienten eine 4 ein.");}
      }
  }
}
