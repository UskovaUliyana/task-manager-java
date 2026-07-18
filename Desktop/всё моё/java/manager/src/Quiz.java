import java.util.Scanner;
public class Quiz {
    public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            String[] m = new String[5];
            int d = 1, i = 0, v;
            String[][] z = new String[15][2];
            while(d != 5 &&(d<4 || d>-1)){
                System.out.println("Выберите действие:");
                System.out.println("\t1. Добавить задачу");
                System.out.println("\t2. Показать все задачи");
                System.out.println("\t3. Отметить как выполненную");
                System.out.println("\t4. Удалить задачу");
                System.out.println("\t5. Выйти");
                d = s.nextInt();
                s.nextLine();
                if(d == 1 ){
                    if(i<15){
                    System.out.println("Введите задачу:");
                    z[i][0] = s.nextLine();
                    z[i][1] = "false";
                    i++;
                    System.out.println("Задача добавлена.");
                    } else{
                        System.out.println("Список задач переполнен.");
                    }

                }else if(d == 2){
                    for(int j = 0; j < i; j++){
                        System.out.println((j+1) +"["+((z[j][1].equals("true"))?"+":"-")+"]" + z[j][0]);
                    }
                } else if(d == 3){
                    System.out.println("Введите номер задачи, которую хотите поментить как выполненную:");
                    for(int j = 0; j < i; j++){
                        System.out.println((j+1) +"["+((z[j][1].equals("true"))?"+":"-")+"]" + z[j][0]);
                    }
                    v = s.nextInt();
                    s.nextLine();
                    if(v-1<i&& v>0){
                        z[v-1][1] = "true";
                    }
                } else if(d == 4){
                    System.out.println("Введите номер задачи, которую хотите удалить:");
                    for(int j = 0; j < i; j++){
                        System.out.println((j+1) +"["+((z[j][1].equals("true"))?"+":"-")+"]" + z[j][0]);
                    }
                    v = s.nextInt();
                    s.nextLine();
                    if(v-1<i && v>0){
                        while(v< i && ((z[v][1].equals("true")) ||( z[v][1].equals("false")))){
                            z[v-1][0] = z[v][0];
                            z[v-1][1] = z[v][1];
                            v++;
                        }
                        z[i-1][0] = "";
                        z[i-1][1] = "";
                        i--;
                    } else{
                        System.out.println("Ошибка!");
                    }

                } else if(d == 5){
                    System.out.println("Вы вышли");
                }
            }
    }
}