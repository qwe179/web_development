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
                
                // =======����� ��=========
                int userNum = 1;
                while(true) {
                    
                    System.out.print("Input Number(1~3) >> ");
                    userNum = s.nextInt();
                    
                    if (1 <= userNum && userNum <= 3)
                        break;
                    else
                        System.out.println("���ڸ� ����� �Է��ϼ���. (1~3)\n");
                }                
                
                // ���� ��ġ��(���)
                for(int i = (lastNum + 1); i <= lastNum + userNum; i++) {
                    
                    if ( i > 31 ) {
                        break;
                    }
                    System.out.println(i + " " + "!");                 
                }
                
                lastNum += userNum;
                if (lastNum >= 31) {
                    //System.out.println(lastNum);
                    System.out.println("\n���� �й��Դϴ�. ��ǻ���� �¸��Դϴ�.\n");
                    comWin++;
                    break;
                }
                    
                System.out.println();
                    
                // =======��ǻ�� ��=========           
                System.out.println("��ǻ�� ��!");
                
                int comNum = 0;
                
                if ( lastNum == 27 )    // lasNum�� 27�϶� ������ 3(28, 29, 30)
                    comNum = 3;
                else if ( lastNum == 28 )    // lasNum�� 28�϶� ������ 2(29, 30)
                    comNum = 2;
                else if ( lastNum == 29 )    // lasNum�� 29�϶� ������ 1(30)
                    comNum = 1;
                else
                    comNum = (int)( Math.random() * (3 - 1 + 1)  + 1 );    // 1~3
                
                // ���� ��ġ��(��)
                for(int i = (lastNum + 1); i <= lastNum + comNum; i++) {
                            
                    if ( i > 31 ) {
                        break;
                    }
                    System.out.println(i + " " + "!");      
                }
                
                lastNum += comNum;
                
                if (lastNum >= 31) {
                    System.out.println("\n��ǻ���� �й��Դϴ�. ���� �¸��Դϴ�.\n");
                    meWin++;
                    break;
                }
                   
                System.out.println();
            }
    }

}