import java.util.Scanner;

class main {
  public static void main(String[] args) {
    
    /*
    String name;
    int hour, check;
    Scanner input = new Scanner (System.in);
    
    System.out.println("Ingresa tu nombre");
    name = input.nextLine();
    System.out.println ("Buen dia " + name + ", por favor ingresa cuanto ganas por hora: ");
    check = input.nextInt();
    System.out.println ("Ahora ingresa cuantas horas trabajas al mes");
    hour = input.nextInt();

    int pay = hour * check;

    if (pay > 450000) {
      System.out.println ("Buen dia " + name + ", al mes estas ganando: " + pay);
    } else {
      System.out.println(name + "... :(");
    }
    */

    /*
    float cant, cal;
    Scanner input = new Scanner(System.in);

    System.out.println("¿Cuantos escritorios quieres comprar?: ");
    cant = input.nextInt();
    cal = cant*8000;

    if (cant < 5) {
      System.out.println("Has comprado " + cant + " escritorios, tienes un descuento del 10%" );
      System.out.println("Subtotal: " + (cal));
      System.out.println("Total: " + (cal-(cal*0.1)));
    } else if (cant >=5 && cant <10) {
      System.out.println("Has comprado " + cant + " escritorios, tienes un descuento del 20%" );
      System.out.println("Subtotal: " + (cal));
      System.out.println("Total: " + (cal-(cal*0.2)));
    } else {
      System.out.println("Has comprado " + cant + " escritorios, tienes un descuento del 40%" );
      System.out.println("Subtotal: " + (cal));
      System.out.println("Total: " + (cal-(cal*0.4)));
    }
    */

    float prom; 
    int type;
    Scanner input = new Scanner(System.in);

    System.out.println("si eres pregrado ingresa 1 o si eres Postgrado ingresa 2:");
    type = input.nextInt();
    System.out.println("Ingresa tu promedio:");
    prom = input.nextFloat();

    if (type == 1) {
      if (prom > 4.5) {
        System.out.println("Cursaras 28 creditos y tendras un descuento de 25% en tu matricula");
        System.out.println("Para un total de " + ((28*50000)*0.75));
      } else if (prom < 4.5 && prom >= 4.0) {
        System.out.println("Cursaras 25 creditos y tendras un descuento de 10% en tu matricula");
        System.out.println("Para un total de " + ((25*50000)*0.90));
      } else if (prom < 4.0 && prom >= 3.5) {
        System.out.println("Cursaras 20 creditos y no tendras ningun descuento");
        System.out.println("Para un total de " + (20*50000));
      } else if (prom < 3.5 && prom >= 2.5) {
        System.out.println("Cursaras 15 creditos y no tendras ningun descuento");
        System.out.println("Para un total de " + (15*50000));
      } else {
        System.out.println("no puedes matricularte");
      }
    } else if (type == 2) {
      if (prom >= 4.5) {
        System.out.println("Cursaras 20 creditos y tendras un descuento de 20% en tu matricula");
        System.out.println("Para un total de " + ((20*300000)*0.80));
      } else {
        System.out.println("Cursaras 10 creditos y no tendras ningun descuento");
        System.out.println("Para un total de " + (10*300000));
      }
    }   
  }
}