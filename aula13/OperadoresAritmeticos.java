public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        int resultado = 1 + 2;
        System.out.println("1 + 2 = " + resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeiroNome = "Esta é";
        String segundoNome = " uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);

        
        //resultado++ : pedindo primeiro imprimir o valor do resultado e adicionar mais 1 a ele;
        //++resultado : pedindo primeiro adicionar mais 1 ao resultado e depois imprimir o valor do resultado;
        System.out.println(resultado++);
        //mesma coisa que
        // System.out.println(resultado);
        // resultado = resultado + 1;
        //resultado += 1;
        System.out.println(++resultado);
        //mesma coisa que
        //resultad += 1;
        //System.out.println(resultado);


        resultado--;
        System.out.println(resultado);

        System.out.println(resultado--);
        System.out.println(--resultado);



}

}
