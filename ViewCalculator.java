package oop7_hw;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculatableFactory calculableFactory;

    public ViewCalculator(ICalculatableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() 
    {
        while (true) 
        {
            String log=prompt("История операций сохраняется в файл: " + Logger.getFileName() + ", хотите изменить название (Y/N) ?");
            if (log.equals("Y")||log.equals("y")) {
                String nFileName=prompt("Введите новое название файла (XXXX.log): ");
                Logger.setFileName(nFileName);
            }
           

            int primaryArg = promptInt("Введите первый аргумент: ");
            Logger.WriteLog("Введите первый аргумент: "+Integer.toString(primaryArg));
            Calculatable calculator = calculableFactory.create(primaryArg);
            while (true) 
            {
                String cmd = prompt("Введите команду (*, /, +, -, =) : ");
                Logger.WriteLog("Введите команду (*, /, +, -, =) : "+cmd);
                if (cmd.equals("*")) 
                {
                    int arg = promptInt("Введите второй аргумент: ");
                    Logger.WriteLog("Введите второй аргумент: "+ Integer.toString(arg));
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("/")) 
                {
                    int arg = promptInt("Введите второй аргумент: ");
                    Logger.WriteLog("Введите второй аргумент: "+ Integer.toString(arg));
                    calculator.div(arg);
                    continue;
                }
                if (cmd.equals("+")) 
                {
                    int arg = promptInt("Введите второй аргумент: ");
                    Logger.WriteLog("Введите второй аргумент: "+ Integer.toString(arg));
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("-")) 
                {
                    int arg = promptInt("Введите второй аргумент: ");
                    Logger.WriteLog("Введите второй аргумент: "+ Integer.toString(arg));
                    calculator.subtract(arg);
                    continue;
                }
            
                if (cmd.equals("=")) 
                {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    Logger.WriteLog("Результат: "+Integer.toString(result));
                    break;
                }

               
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            Logger.WriteLog("Еще посчитать (Y/N)?  "+cmd);
            if (cmd.equals("Y")||cmd.equals("y")) 
            {
                continue;
            }
            
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
        
    }

    private int promptInt(String message) {
        
        Scanner in = new Scanner(System.in);
        System.out.print(message);

        while(!in.hasNextInt())
        {             
             System.out.print(message);
             in.nextLine();
        }
        
        return Integer.parseInt(in.nextLine());
    }
}
