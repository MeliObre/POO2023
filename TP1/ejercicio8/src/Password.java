import java.util.Random;

public class Password {
    private int longitud;
    private String password;


    public Password() {
        this.longitud = 8; // Longitud por defecto
        generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    private void generarPassword() {
        String caracteresMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String caracteresMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String dígitos = "0123456789";

        StringBuilder constructorContraseña = new StringBuilder();
        Random aleatorio = new Random();

        int contadorMayusculas = 0;
        int contadorMinusculas = 0;
        int contadorDigitos = 0;

        for (int i = 0; i < longitud; i++) {
            int categoría = aleatorio.nextInt(3); // 0: Mayúscula, 1: Minúscula, 2: Dígito
            char carácterAleatorio;

            switch (categoría) {
                case 0:
                    if (contadorMayusculas < 2) {
                        carácterAleatorio = caracteresMayusculas.charAt(aleatorio.nextInt(caracteresMayusculas.length()));
                        contadorMayusculas++;
                    } else {
                        carácterAleatorio = caracteresMinusculas.charAt(aleatorio.nextInt(caracteresMinusculas.length()));
                    }
                    break;
                case 1:
                    if (contadorMinusculas < 1) {
                        carácterAleatorio = caracteresMinusculas.charAt(aleatorio.nextInt(caracteresMinusculas.length()));
                        contadorMinusculas++;
                    } else {
                        carácterAleatorio = dígitos.charAt(aleatorio.nextInt(dígitos.length()));
                    }
                    break;
                case 2:
                    if (contadorDigitos < 2) {
                        carácterAleatorio = dígitos.charAt(aleatorio.nextInt(dígitos.length()));
                        contadorDigitos++;
                    } else {
                        carácterAleatorio = caracteresMayusculas.charAt(aleatorio.nextInt(caracteresMayusculas.length()));
                    }
                    break;
                default:
                    carácterAleatorio = ' ';
                    break;
            }

            constructorContraseña.append(carácterAleatorio);
        }

        this.password = constructorContraseña.toString();
    }

    public String obtenerContraseña() {
        return password;
    }

    public int obtenerLongitud() {
        return longitud;
    }

    public void establecerLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public boolean esFuerte() {
        int contadorMayusculas = 0;
        int contadorMinusculas = 0;
        int contadorDigitos = 0;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                contadorMayusculas++;
            } else if (Character.isLowerCase(c)) {
                contadorMinusculas++;
            } else if (Character.isDigit(c)) {
                contadorDigitos++;
            }
        }

        return contadorMayusculas > 2 && contadorMinusculas > 1 && contadorDigitos > 1;
    }

}
