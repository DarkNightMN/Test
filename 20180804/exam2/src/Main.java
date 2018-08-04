import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("请输入工资：");
        Scanner scanner=new Scanner(System.in);
        double salary=scanner.nextDouble();
        double res=0.0;
        double overSalary=salary-3500;
        if(overSalary<=0){
            res=0;
        }else if(overSalary<=1500){
            res=overSalary*0.03;
        }else if(overSalary<=4500){
            res=1500*0.03+(overSalary-1500)*0.1;
        }else if(overSalary<=9000){
            res=1500*0.03+(4500-1500)*0.1+(overSalary-4500)*0.2;
        }else if(overSalary<=35000){
            res=1500*0.03+(4500-1500)*0.1+(9000-4500)*0.2+(overSalary-9000)*0.25;
        }else if(overSalary<=55000){
            res=1500*0.03+(4500-1500)*0.1+(9000-4500)*0.2+(35000-9000)*0.25+(overSalary-35000)*0.3;
        }else if(overSalary<=80000){
            res=1500*0.03+(4500-1500)*0.1+(9000-4500)*0.2+(35000-9000)*0.25+(55000-35000)*0.3+(overSalary-55000)*0.35;
        }else{
            res=1500*0.03+(4500-1500)*0.1+(9000-4500)*0.2+(35000-9000)*0.25+(55000-35000)*0.3+(80000-55000)*0.35+(overSalary-80000)*0.45;
        }
        System.out.println("所需要缴纳的税费为:"+res);
    }
}
