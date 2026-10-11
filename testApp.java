public class testApp
{
//    instance variables can only be used in an instance of the class
    public int a;
    public int getA(){
        return a;
    }
//    Class variable:
    static int i;
    public static void main(String[] args){

        System.out.println("The value of i is " + i);
//  Initialising a local variable:
        int j;
        j = 0;
        var app = new testApp();
        System.out.println();

    }
}// You dont have to initialise a class or instance variable to use it, but you do with local variable
//Instance methods are talked about in book 3