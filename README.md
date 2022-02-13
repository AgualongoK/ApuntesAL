# ApuntesAL
 Apuntes sobre la creación, uso y métodos derivados de un ArrayList. [Programación - FP Superior Desarrollo de Aplicaciones Multiplataforma 1er año]
 

 # Definición, uso y creación de un ArrayList
 
¿Qué es un ArrayList?

Es una lista que utiliza arrays (variables que almacenan datos en su interior).
Su tamaño es modificable, es decir, cambiará o no la longitud de éste al añadir o eliminar elementos.
Por defecto, un ArrayList siempre será de tipo Object. 

¿Para qué se usa un ArrayList? 

Es una manera sencilla y óptima de almacenar datos que posteriormente pueden ser usados a lo largo del código. 

¿Cómo se crea un ArrayList?

La creación de éste es la siguiente:

ArrayList nombre_ArrayList = new ArrayList();

Pero, podemos especificar el tipo de dato que queremos que almacene dentro de él para así evitar errores al futuro. Para ello, introducimos el tipo de variable que queramos dentro de los < >. Por ejemplo:

ArrayList<String> nombre_ListaString = new ArrayList();

ArrayList<Integer> nombre_ListaInteger = new ArrayList();

ArrayList<Double> nombre_ListaDouble = new ArrayList();
