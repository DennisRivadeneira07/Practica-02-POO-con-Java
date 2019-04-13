/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.clases.Avión;
import ec.edu.ups.clases.AviónDeCarga;
import ec.edu.ups.clases.AviónMilitar;
import ec.edu.ups.clases.Helicoptero;
import ec.edu.ups.clases.HelicopteroGrua;
import ec.edu.ups.clases.HelicopteroMilitar;
import ec.edu.ups.clases.MedioTransporteAereo;
import java.util.ArrayList;
import java.util.List;

/**
 *Prueba 
 * 
 * En la clase prueba llamamos a todas las clases hijas , impportamos
 * mandamos los datos requeridos en cada metodo ,creamos una lista con los objetos de la clases hija y
 * atraves de un InstansOf para verificar que el objeto es del tipo de la clase de la clase abuelo,en si esta clase 
 * nos permitira imprimir todos los datos que creamos en los metodos .
  * 
 * @author Dennnis Andrés Rivadeneira Cabrera
 * @since 2019
 * @version 2.0
 * @see https://github.com/DennisRivadeneira07/Practica-02-POO-con-Java.git
 */
public class Prueba {

    public static void main(String[] args) {

        AviónDeCarga aviC = new AviónDeCarga("250 Toneladas", 20,"Este avión tiene vehiculos de carga", 45, 2, 3,"8AM ,12AM y 4AM","Clase Alta", 2, 6,"2000 por Unidad",5 , "10000m");
        AviónMilitar aviMili = new AviónMilitar("1 Tonelada", 9,"Armas Militares","BattleFlied", 2, 8, "7AM,12AM,5 PM ,9PM","Clase Alta y Clase Baja", 2, 200,"1000 Dolares ", 3,"10000m" );
        HelicopteroGrua heliG = new HelicopteroGrua("50 metros", "5 Toneladas", 2,"1 metro de  largo", 4, 22, 33,"Robinson ", 4, 7, "5000 Dolares", 1, "5000 m ");
        HelicopteroMilitar heliMili = new HelicopteroMilitar(3, "Apache", "Barred P83", 7, 4, 23,12, "Agusta", 4, 2,"2000 Dolares", 1, "12000 m");
        System.out.print(aviC);
        System.out.println(aviMili);
        System.out.println(heliG);
        System.out.println(heliMili);

        List<MedioTransporteAereo> lista = new ArrayList<>();
        lista.add(aviC);
        lista.add(aviMili);
        lista.add(heliG);
        lista.add(heliMili);

        for (MedioTransporteAereo medioTransporteAereo : lista) {
            if (medioTransporteAereo instanceof AviónDeCarga) {
                AviónDeCarga temp = (AviónDeCarga) medioTransporteAereo;
                System.out.println(temp);
            } else if (medioTransporteAereo instanceof AviónMilitar) {
                AviónMilitar temp = (AviónMilitar) medioTransporteAereo;
                System.out.println(temp);
            } else if (medioTransporteAereo instanceof HelicopteroMilitar) {
                HelicopteroMilitar temp = (HelicopteroMilitar) medioTransporteAereo;
                System.out.println(temp);

            } else if (medioTransporteAereo instanceof HelicopteroGrua) {
                HelicopteroGrua temp = (HelicopteroGrua) medioTransporteAereo;
                System.out.println(temp);
            }
        }

        Avión av = new Avión(2, 8, "7AM , 12 AM, 4PM , 9 PM","Clase Alta y Baja", 2, 200, "2000 Dolares", 3, "10000 m"){
            @Override
            public String aterrizar() {
                return "ATERRIZAR";
            }
        };

        System.out.println(av);
        System.out.println(av.aterrizar());
        
        Helicoptero he = new Helicoptero(2, 32, 22, "Robinson",2, 10, "2000 Dolares", 1, "5000 m"){
        @Override
        public String volar() {
            return "volando";
        }
    };
      System.out.println(he);
        System.out.println(he.volar());
        
        
        
        
        
        
    }
    
        
}