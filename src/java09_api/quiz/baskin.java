package java09_api.quiz;

import java.util.Random;
import java.util.Scanner;

import java.util.Scanner;

public class baskin {
    
    static Scanner s = new Scanner(System.in);
    static int meWin = 0; 
    static int comWin = 0;
 
    public static void main(String[] args) {
    	
            System.out.println();
            System.out.println("<< Game Start >>");
            
            int lastNum = 0;        
            
            while(true) {    
                
                // =======사용자 턴=========
                int userNum = 1;
                while(true) {
                    
                    System.out.print("Input Number(1~3) >> ");
                    userNum = s.nextInt();
                    
                    if (1 <= userNum && userNum <= 3)
                        break;
                    else
                        System.out.println("숫자를 제대로 입력하세요. (1~3)\n");
                }                
                
                // 숫자 외치기(사람)
                for(int i = (lastNum + 1); i <= lastNum + userNum; i++) {
                    
                    if ( i > 31 ) {
                        break;
                    }
                    System.out.println(i + " " + "!");                 
                }
                
                lastNum += userNum;
                if (lastNum >= 31) {
                    //System.out.println(lastNum);
                    System.out.println("\n너의 패배입니다. 컴퓨터의 승리입니다.\n");
                    comWin++;
                    break;
                }
                    
                System.out.println();
                    
                // =======컴퓨터 턴=========           
                System.out.println("컴퓨터 턴!");
                
                int comNum = 0;
                
                if ( lastNum == 27 )    // lasNum이 27일때 무조건 3(28, 29, 30)
                    comNum = 3;
                else if ( lastNum == 28 )    // lasNum이 28일때 무조건 2(29, 30)
                    comNum = 2;
                else if ( lastNum == 29 )    // lasNum이 29일때 무조건 1(30)
                    comNum = 1;
                else
                    comNum = (int)( Math.random() * (3 - 1 + 1)  + 1 );    // 1~3
                
                // 숫자 외치기(컴)
                for(int i = (lastNum + 1); i <= lastNum + comNum; i++) {
                            
                    if ( i > 31 ) {
                        break;
                    }
                    System.out.println(i + " " + "!");      
                }
                
                lastNum += comNum;
                
                if (lastNum >= 31) {
                    System.out.println("\n컴퓨터의 패배입니다. 너의 승리입니다.\n");
                    meWin++;
                    break;
                }
                   
                System.out.println();
            }
    }

}