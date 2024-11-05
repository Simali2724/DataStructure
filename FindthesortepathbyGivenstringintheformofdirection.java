import java.util.Scanner;

public class FindthesortepathbyGivenstringintheformofdirection {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        String  path=s.nextLine();
        System.out.println(GetShortestPath(path));
    }
    public static  float GetShortestPath(String path){
       int x=0,y=0;
        for(int i = 0;i<path.length();i++) {
            char direction= path.charAt(i);
            if(direction=='E') {
                x++;
            } else if (direction=='W') {
                x--;
            } else if (direction=='N') {
                y++;
            } else {
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2 + y2);
    }
}
//Given a rout containg 4 direction (s,e,w,n) find the shortest path to reach destination ex-"WNEENESNNN"
//n-north,s-south,e-east,waste-w