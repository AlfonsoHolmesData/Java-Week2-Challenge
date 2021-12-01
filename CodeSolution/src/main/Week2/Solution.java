public class Solution {


    public static void main(String[] args){

        System.out.println(rps("rock", "paper"));
        System.out.println(rps("paper", "rock"));
        System.out.println( rps("paper", "scissors"));
        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("scissors", "paper"));
    }



        public static String rps(String p1 , String p2) {
                if(p1.equals(p2)){
                    return "TIE";
                }else if(p1.equals("paper") && p2.equals("rock")){
                    return "Player 1 wins";
                }else if(p1.equals("rock") && p2.equals("paper")){
                    return "Player 2 wins";
                }else if(p1.equals("scissors") && p2.equals("paper")){
                    return "Player 1 wins";
                }else if(p1.equals("paper") && p2.equals("scissors")){
                    return "Player 2 wins";
                }else if(p1.equals("rock") && p2.equals("scissors")){
                    return "Player 1 wins";
                }else if(p1.equals("scissors") && p2.equals("rock")){
                    return "Player 2 wins";
                }else{
                    return "Invalid selection";
                }

        }


}
