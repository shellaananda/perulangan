public class Perulangan {
public static void main (String[] args){    
    int J = 10;
    for (int i=1; i<=J; i++){

        for (int K=1; K<=J-i; K++){
            System.out.print(" ");
        }

        for (int L=1; L<=i*2-1; L++){
            System.out.print("*");
        }
    System.out.println();
    }

}

}