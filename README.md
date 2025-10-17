# Lab7Musica
Repositorio aplicando abstracción, herencia y polimorfismo.
ABSTRACCIÓN Y POLIMORFISMO


La abstracción oculta los detalles de implementación para mostrar las características esenciales, mientras que el polimorfismo permite que los objetos de diferentes clases respondan a la misma llamada de método de manera diferente. En el ejemplo de un Coche y una Moto en Java, se puede definir una clase abstracta Vehiculo con un método abstracto acelerar(). Las clases Coche y Moto implementan acelerar() de forma específica, y gracias al polimorfismo, una lista de Vehiculo puede llamar a acelerar() en cada uno de sus objetos (coches y motos) de forma segura.  


Abstracción 

•	¿Qué es?  
Se enfoca en mostrar lo esencial de un objeto y ocultar los detalles internos. 
•	Ejemplo en Java:  
Se puede usar una clase abstracta o una interfaz para definir los métodos que deben tener la superclase MUSICA. La clase abstracta MUSICA contendrá un método abstract void REPRODUCIR().  

Las clases abstractas son súper útiles cuando:
•	Quieras asegurarte de que todas las subclases compartan algunos comportamientos: En nuestro ejemplo, todas las personas tienen que REPRODUCIR y DETENER, pero cómo lo hacen es diferente.
•	Necesites que cada subclase implemente esos comportamientos a su manera: En este caso, POP O ROCK reproducen diferentes temas, pero ambos deben hacerlo.
•	Evitar repetir código: Si varias clases tienen algo en común, puedes definirlo en una clase abstracta para no tener que repetirlo en cada subclase.


Polimorfismo 

•	¿Qué es?  
Permite que un objeto pueda ser tratado como un objeto de su clase padre, pero que ejecute el comportamiento de su clase concreta.  
•	Ejemplo en Java: 
o	Se crean las clases POP, ROCK Y CLASICA que heredan de la clase abstracta MUSICA. 
o	Cada una de ellas implementa el método reproducir() a su manera (por ejemplo, con diferentes canciones). 
o	En el método main, se puede tener una lista de tipo MUSICA que contenga instancias de POP, ROCK Y CLASICA. 
o	Al llamar al método reproducir() en cada elemento de la lista, se ejecuta la implementación correcta (segun la cancion) en tiempo de ejecución.  
 
 
 Conclusión

	Las clases abstractas en Java son una excelente herramienta cuando necesitas definir comportamientos comunes, pero que puedan ser personalizados por cada subclase. Una clase abstracta obliga a que sus subclases, implementen a su manera los métodos asignados.

	Con esta estructura, puedes asegurarte de que todas las subclases cumplan con ciertos requisitos, pero sin perder flexibilidad a la hora de definir cómo deben hacerlo.

	El concepto de Java Polimorfismo nos ayuda a la hora de generar flexibilidad en el código pero sobre todo también a la hora de simplificar el número de conceptos que un programador debe manejar.

	El polimorfismo y la herencia son pilares fundamentales de la Programación Orientada a Objetos (POO). Su correcta aplicación en proyectos reales puede marcar la diferencia entre un código legible y fácil de mantener, o un sistema propenso a errores y difícil de extender.
