import java.util.*;

public class lms {
    
    public static RobotPos moveRobot(int [][]grid, RobotPos robotNow, String[] move) {
        int i = robotNow.x_pos;
        int j = robotNow.y_pos;
        int pos = 0;
        String err = "";
        for(;pos<move.length; ) {
                char ch = move[pos].charAt(0);
                // System.out.println(ch);
                pos++;
                switch(ch) {
                    case 'L':
                        if(robotNow.dir.equals("E")) {
                            robotNow.dir="";
                            robotNow.dir="N";
                        }
                        else if(robotNow.dir.equals("W")) {
                            robotNow.dir="";
                            robotNow.dir="S";
                        }
                        else if(robotNow.dir.equals("N")) {
                            robotNow.dir="";
                            robotNow.dir="W";
                        }
                        else if(robotNow.dir.equals("S")) {
                            robotNow.dir="";
                            robotNow.dir="E";
                        }
                        break;
                    case 'M':
                        if(robotNow.dir.equals("E")) {
                            if(j+1==4) {
                                robotNow.dir+="-ER";
                                return robotNow;
                            }
                            robotNow.y_pos++;
                            j++;
                        }
                        else if(robotNow.dir.equals("W")) {
                            robotNow.y_pos--;
                            j--;
                        }
                        else if(robotNow.dir.equals("N")) {
                            robotNow.x_pos--;
                            i--;
                        }
                        else if(robotNow.dir.equals("S")) {
                            robotNow.x_pos++;
                            i++;
                        }
                        
                        break;
                    case 'R':
                        if(robotNow.dir.equals("E")) {
                            robotNow.dir="";
                            robotNow.dir="S";
                        }
                        else if(robotNow.dir.equals("W")) {
                            robotNow.dir="";
                            robotNow.dir="N";
                        }
                        else if(robotNow.dir.equals("N")) {
                            robotNow.dir="";
                            robotNow.dir="E";
                        }
                        else if(robotNow.dir.equals("S")) {
                            robotNow.dir="";
                            robotNow.dir="W";
                        }
                        break;   
                }
                if(i>=grid.length || j>=grid[0].length && err!="ER") {
                    robotNow.dir+="-ER";
                    err+="ER";
                    break;
                }
            }
        return robotNow;
    }
    
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        String str = s.next();
        RobotPos robotNow = new RobotPos((str.charAt(0)-'0'), (str.charAt(2)-'0'), str.charAt(4)+"");
        s.nextLine();
        String movements = s.nextLine();
        int grid[][] = new int[x+1][y+1];
        String move[] = movements.split(" ");
        RobotPos output = moveRobot(grid, robotNow, move);
        System.out.println(output.y_pos+ "-" +output.x_pos+"-"+output.dir);
        s.close();
        s2.close();
    }
}

class RobotPos {
    int x_pos;
    int y_pos;
    String dir;
    RobotPos(int x_pos, int y_pos, String dir) {
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.dir=dir;
}
}