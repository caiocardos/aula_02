public class Selecao {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        if(a == b){
            System.out.println(" a = b");
        } else if (a<b){
            System.out.println("a < b");
        }
         else {
            System.out.println("a > b");
        }

        int dia = 3;
        String diaSemana;

        switch (dia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda";
                break;
            case 3:
                diaSemana = "Terca";
                break;
            default:
                diaSemana = "Dia invalido";
                break;
        }
        System.out.println(diaSemana);

    }
}
