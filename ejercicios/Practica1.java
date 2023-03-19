class Practica1 {  
    // 1.Vamos a practicar operaciones básicas con números
    
    
    // A Utilizando la sentencia while, realice un ejemplo que muestre los números del 1 al 
    // 100 utilizando la instrucción while. Y luego, que imprima los mismos por pantalla
    public static void EjecutarA(){  
        //         //Vamos a practicar operaciones básicas con números
        // a. Utilizando la sentencia while, realice un ejemplo que muestre los números del 1 al
        // 100 utilizando la instrucción while. Y luego, que imprima los mismos por pantalla
        int c = 0;
        while (c < 100) {
            c++;
            System.out.println(c);
        } 


    }
    //B. A lo anterior, que muestre los números del 1 al 100 utilizando la instrucción for
    public static void EjecutarB(){  
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
    // C.A lo anterior, con la sentencia do while
    public static void EjecutarC(){  
        int c = 0;
        do  {
            c++;
            System.out.println(c);

        } while (c < 100);
    }
    // D.Utilizando la sentencia for, hacer lo mismo que en (b) pero que el valor a imprimir por 
    // pantalla, sea el doble. 
    public static void EjecutarD(){  
        for (int i = 1; i <= 100; i++) {
            System.out.println(i * 2);
        }
    }
}