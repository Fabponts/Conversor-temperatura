import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("---Bem-vindo ao conversor de Temperatura---");
        Scanner sc = new Scanner(System.in);

        double celsius = 0;
        double fahrenheit = 0;
        double kelvin = 0;
        char resposta;

        do{
        System.out.println("Digite a temperatura:");
        double temperatura = sc.nextDouble();

        System.out.println("Digite a unidade desejada: Celsius,fahereint ou kelvin");
        String unidade = sc.next().toLowerCase(); //Uso do toLowerCase

        if (unidade.equals("celsius")){ //.equals permite igualar a strings pelo visto
            celsius = temperatura;
            kelvin = celsius + 273.15;
            fahrenheit = (celsius * 9 / 5) + 32;
        }
        else if (unidade.equals("fahereint")) {
            fahrenheit = temperatura;
            celsius = (fahrenheit - 32) * 5 / 9;
            kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
        }
        else if(unidade.equals("kelvin")){
            kelvin = temperatura;
            celsius = kelvin - 273.15;
            fahrenheit = (kelvin - 273.15) * 9 / 5 + 32;
        }
        else{
            System.out.println("Unidade invalida"); // Nao esquecer de por a opçao invalida também

        }
        System.out.println("Temperatura em Celsius: " + celsius);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura em Kelvin: " + kelvin);
        System.out.println("Deseja realizar outra conversão? (s/n)");

        resposta = sc.next().charAt(0);
        }while (resposta != 'n'); //Uso do doWhile para poder criar um loop

        sc.close();
    }
}
