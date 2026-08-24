public class built_in_String {

    public static void main(String[] args) {
        
        String frase = "Java é muito bom";

        //lenght conta os caracteres da frase
        System.out.println("A frase contém " + frase.length() + " caracteres.");

        //sbstring pega uma parte da frase
        System.out.println("A frase contém " + frase.substring(0, 4) + " na posição 0 até a posição 4.");

        //toUpperCase deixa a frase em maiúsculo
        System.out.println("A frase em maiúsculo é: " + frase.toUpperCase());

         //toLowerCase deixa a frase em minúsculo
        System.out.println("A frase em minúsculo é: " + frase.toLowerCase());

        //replace substitui uma palavra ou letra da frase por outra
        System.out.println("A frase substituindo a palavra bom por ruim é: " + frase.replace("bom", "ruim"));


        //Pode armazenar o resultado de uma modificação em uma nova variável.
       String fraseModificada = frase.toUpperCase().replace("JAVA", "Python");
        System.out.println("A frase modificada é: " + fraseModificada);

    
    }

}