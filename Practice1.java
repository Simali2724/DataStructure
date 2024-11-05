import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int teamA = s.nextInt();
        int teamB = s.nextInt();
        int teamC = s.nextInt();
        int teamD = s.nextInt();
        if (teamA > teamC && teamB > teamD) {
            if (teamA > teamB && teamC > teamD) {
                System.out.println("Winner is team A");
                System.out.println("Runner up is  team B");
                System.out.println("Second runner up is team c which can win bronz meddle");
                System.out.println("Third runner up or 4 rth position team is D");
            } else {
                if (teamB > teamA && teamC > teamD) {
                    System.out.println("Winner is team B");
                    System.out.println("Runner up is  team C");
                    System.out.println("Second runner up is team c which can win bronz meddle");
                    System.out.println("Tird runner up or 4 rth position team is D");
                    
                }
                else 
                    if(teamB > teamA && teamD > teamC) {
                        System.out.println("Winner is team B");
                        System.out.println("Runner up is  team C");
                        System.out.println("Second runner up is team D which can win bronz meddle");
                        System.out.println("Tird runner up or 4 rth position team is C");
                }
            }
        } else if (teamC> teamA && teamD > teamB) {
            if(teamC > teamD &&   teamA>teamB) {
                System.out.println("Winner is team C");
                System.out.println("Runner up is  team D");
                System.out.println("Second runner up is team A which can win bronz meddle");
                System.out.println("Third runner up or 4 rth position team is B");
            } else {
                if (teamD > teamC && teamA > teamB) {
                    System.out.println("Winner is team D");
                    System.out.println("Runner up is  team C");
                    System.out.println("Second runner up is team A which can win bronz meddle");
                    System.out.println("Third runner up or 4 rth position team is B");
                } else if (teamD > teamC && teamB > teamA) {
                    System.out.println("Winner is team D");
                    System.out.println("Runner up is  team C");
                    System.out.println("Second runner up is team B which can win bronz meddle");
                    System.out.println("Third runner up or 4 rth position team is A");
                }
            }
        }
    }
}
