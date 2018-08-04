import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("请输入日期：");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String[] temp=s.split("-");
        int year=Integer.parseInt(temp[0]);
        int month=Integer.parseInt(temp[1]);
        int day=Integer.parseInt(temp[2]);
        boolean isLeap=(year%400==0||(year%4==0&&year%100!=0));

        if ((month==2 && ((isLeap && day>29)||(!isLeap && day>28)))
                || !(month>=1 && month<=12)
                ||day>31||
                (day>30 &&(month==4||month==6||month==9||month==11))){
            System.out.println("您输入的日期不存在");
        }
        else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                    if (day == 31) {
                        month++;
                        day = 1;
                    }else day++;
                    break;
                case 12:
                    if (day == 31) {
                        year++;
                        month = 1;
                        day=1;
                    }else day++;
                    break;
                case 2:
                    if((isLeap && day==29)||(!isLeap && day==28)){
                        month++;
                        day=1;
                    }
                    else day++;
                    break;
                default:
                    if (day == 30) {
                        month++;
                        day = 1;
                    }else day++;
                    break;
            }
            System.out.printf("下一天为：%04d-%02d-%02d",year,month,day);
        }
    }
}
