import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the volume calculator!");
    sum(3);
  }

  public static void sum(int n){
  if(n==0){
    System.out.println("Your volume is " + vol);
    }if(n==1){
    System.out.println("Type in the width.");
    Scanner length = new Scanner(System.in);

    n--;
    sum();
    }if(n==2){
    System.out.println("Type in the height.");
    Scanner length = new Scanner(System.in);

    n--;
    sum();
    }if(n==3){
    System.out.println("Type in the length.");
    Scanner length = new Scanner(System.in);

    n--;
    sum();
    }
  }
}