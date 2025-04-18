// basic calculator 
public  class Calculator{

  //function to add two integers
  public int add(int num1,int num2){
    return num1 + num2;
  }

  //function to substract two integers
  public int subtract(int num1,int num2){
    return num1-num2;
  }

  //function to multiply two integers
  public int multiply(int num1, int num2){
    return num1 * num2;
  }

  //function to divide two integers
  public int divide(int num1, int num2){
    return num1 / num2;
  }

  //function to get modulo of two integers
  public int modulo(int num1, int num2){
    return num1 % num2;
  }

  public static void main(String[] args){
    Calculator myCalculator= new Calculator();

    System.out.println("Your add value is : " +myCalculator.add(5,7));

    System.out.println("Your subtract value is : " 
    + myCalculator.subtract(45,11));

    System.out.println("Your divided value is : " 
    +myCalculator.divide(7,3));

    System.out.println("Your multiply value is : " 
    + myCalculator.multiply(5,5));
  }
} 