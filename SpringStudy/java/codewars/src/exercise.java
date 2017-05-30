package codewars.src;

/**
 * Created by rob on 5/25/17.
 */
public class exercise {

    public static void main(String[] args) {
        int numberOfSquares = 0;
        for (int i = 0; i<=2;i++){
            double square = Math.sqrt(i);
            if((square == Math.ceil(square)) || (square == Math.round(square))){
                numberOfSquares++;
                System.out.println("square: "+square);
            }
        }
        System.out.println(numberOfSquares);
    }
}
