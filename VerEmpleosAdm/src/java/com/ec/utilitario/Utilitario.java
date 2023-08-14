/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.utilitario;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 *
 * @author root
 */
public class Utilitario {

    public static void disableSslVerification() {
        try {
            TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }};

            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            System.out.println("error al desabilitar SSl");
        }
    }

    public static String quitaCaracteresEspeciales(String texto) {
        String nombres = texto.toUpperCase();
        nombres = nombres.replace("Ã", "Ñ");
        nombres = nombres.replace("Ã“", "Ñ");
        nombres = nombres.replace("Ãš", "Ñ");
        nombres = nombres.replace("Ã±", "Ñ");
        nombres = nombres.replace("Ã‘", "Ñ");
        nombres = nombres.replace("­Â­", "Ñ");
        nombres = nombres.replace("uÃn", "Ñ");
        nombres = nombres.replace("í±", "Ñ");
        nombres = nombres.replace("Ã", "Ñ");
        nombres = nombres.replace("Ã", "Ñ");
        nombres = nombres.replace("Ã¡", "á");
        nombres = nombres.replace("Ã©", "é");
        nombres = nombres.replace("Ã*", "í");
        nombres = nombres.replace("Ã", "í");
        nombres = nombres.replace("Ã³", "ó");
        nombres = nombres.replace("Ãº", "ú");
        nombres = nombres.replace("Ã", "Á");
        nombres = nombres.replace("Ã‰", "É");
        nombres = nombres.replace("Ã", "Í");
        nombres = nombres.replace("Ã“", "Ó");
        nombres = nombres.replace("Í¿", "Ó");
        nombres = nombres.replace("Ãš", "Ú");
        nombres = nombres.replace("Ã±", "ñ");
        nombres = nombres.replace("Ã‘", "Ñ");
        nombres = nombres.replace("­Â­", " ");
        nombres = nombres.replace("uÃn", "uín");
        nombres = nombres.replace("í±", "ñ");
        nombres = nombres.replace("í³", "ó");
        nombres = nombres.replace("íº", "ú");

        return nombres.toUpperCase();
    }

    public static boolean isEmail(String correo) {
        String expression = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        mat = pat.matcher(correo);
        if (mat.find()) {
            System.out.println("[" + mat.group() + "]");
            return true;
        } else {
            return false;
        }
    }

    public static String reemplazarCaracteresRaros(String input) {
        // Cadena de caracteres original a sustituir.
        String original = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ/\\;\"&";
        // Cadena de caracteres ASCII que reemplazarán los originales.
        String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC-----";
        String output = input;
        for (int i = 0; i < original.length(); i++) {
            // Reemplazamos los caracteres especiales.
            output = output.replace(original.charAt(i), ascii.charAt(i));
        }//for i
        return output;
    }//reemplazarCaracteresRaros

}
