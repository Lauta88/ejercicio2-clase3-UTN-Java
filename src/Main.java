public class Main {
    public static void main(String[] args) {

        char[] abecedario = " abcdefghijklmnñopqrstuvwxyz".toCharArray();
        String saludo = "hola que tal";

        System.out.println(codificarCadena(saludo, abecedario));
        System.out.println(decodificarCadena("ipmbarvfaubm", abecedario));

    }

    private static String codificarCadena(String texto, char[] abecedario){
        String textoCodificado = "";
        char[] saludoArray = texto.toCharArray();
        for (int i = 0; i < saludoArray.length; i++) {

            for (int j = 0; j < abecedario.length; j++) {
               if (saludoArray[i] == abecedario[j]){
                   if ((j + 1) == abecedario.length) {
                       textoCodificado += abecedario[0];
                   } else {
                       textoCodificado += abecedario[j + 1];
                   }
               }
            }
        }
        return textoCodificado;
    }

    private static String decodificarCadena(String texto, char[] abecedario){
        String textoDecodificado = "";
        char[] saludoArray = texto.toCharArray();
        for (int i = 0; i < saludoArray.length; i++) {

            for (int j = 0; j < abecedario.length; j++) {
                if (saludoArray[i] == abecedario[j]){
                    if ((j + 1) == abecedario.length) {
                        textoDecodificado += abecedario[0];
                    } else {
                        textoDecodificado += abecedario[j - 1];
                    }
                }
            }
        }
        return textoDecodificado;
    }
}