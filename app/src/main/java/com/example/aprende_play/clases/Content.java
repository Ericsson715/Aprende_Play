package com.example.aprende_play.clases;

public class Content {


    public static String Pregunta(int N_Pregunta) {
        String cadena = "";
        switch (N_Pregunta) {
            case 1:
                cadena = "El COVID-19, coronavirus o “virus con corona”, es un pequeño microorganismo nuevo para los seres humanos." +
                        "inusuales.\n" +
                        "• Por este motivo, la enfermedad que produce, aunque es similar a la gripa, puede ser más fuerte que otras enfermedades respiratorias que se suelen presentar en los diferentes momentos del año. " +
                        "Al ser nueva, nuestros cuerpos no se encuentran preparados para ella, por esto las autoridades sanitarias han pedido que se tomen precauciones con el fin de evitar al máximo que sean muchos los afectados\n" +

                        "les impide predecir o entender las acciones de otras personas.";


                ;
                break;
            case 2:
                cadena = "•Fiebre de difícil control, mayor a 37,5 por más de 3 días\n" +
                        "\n" +
                        "°Tos\n" +
                        "\n" +
                        "°Dificultad para respirar\n" +
                        "\n" +
                        "°Fatiga\n" +
                        "\n" +
                        "°Malestar general\n" +
                        "\n" +
                        "°Secreción y goteo nasal."

                      ;
                break;
            case 3:
                cadena = "El virus se trasmite cuando una persona enferma tose o estornuda y expulsa partículas del virus que entran en contacto con otras personas, directamente o a través de superficies. "

                        ;
                break;

                case 4:
                    cadena = "¿Cómo prevenirlo?\n" +
                            "°Lávate las manos correctamente, con agua y jabón.\n" +
                            "\n" +
                            "°Evita el contacto cercano con personas enfermas\n" +
                            "\n" +
                            "°Al estornudar, cúbrete con la parte interna del codo\n" +
                            "\n" +
                            "°Si tienes síntomas de resfriado, quédate en casa y usa tapabocas\n" +
                            "\n";
                    break;

            default:
                cadena = "Opcion no valida";
                break;

        }
        return cadena;

    }
}
