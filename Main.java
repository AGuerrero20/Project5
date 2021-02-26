import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the volume calculator!");
    System.out.println("Your cube's volume is " + vol(3, 0, 0, 0));
  }

  public static int vol(int n, int length, int height, int width){
    int vol = 0;
    Scanner scan = new Scanner(System.in);
  if(n==3){
    System.out.println("Type in the length.");
    length = scan.nextInt();

    n--;
    return vol(n, length, 0, 0);
    }else if(n==2){
    System.out.println("Type in the height.");
    height = scan.nextInt();

    n--;
    return vol(n, length, height, 0);
    }else if(n==1){
    System.out.println("Type in the width.");
    width = scan.nextInt();

    n--;
    return vol(n, length, height, width);
    }else{
    return vol = height * width * length;
    }
  }
}