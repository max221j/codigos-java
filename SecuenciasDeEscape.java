class SecuenciasDeEscape {
    public static void main(String[] args) {
        // Salto de línea
        System.out.println("Texto 1\nTexto 2");

        // Tabulación
        System.out.println("Texto 3\tTexto 4");

        // Retorno de carro (sobreescribe el inicio de la línea)
        System.out.println("Texto 5\rTexto 6");

        // Comillas dobles dentro de la cadena
        System.out.println("\"Texto 7\" Texto 8");

        // Barra invertida
        System.out.println("Texto 9\\ Texto 10");
    } // Fin del método main
} // Fin de la clase SecuenciasDeEscape