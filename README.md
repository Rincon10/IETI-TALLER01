# IETI-TALLER01 

## Prerrequisitos

-   [Git](https://git-scm.com/downloads) - Version Control System
-   [Maven](https://maven.apache.org/download.cgi) - Dependency Management
-   [Java 8](https://www.java.com/download/ie_manual.jsp) - Development Environment
-   [Spring-Boot](https://spring.io/projects/spring-boot) - Framework Web
-   [Intellij Idea](https://www.jetbrains.com/es-es/idea/download/) (Opcional)

## Tutoriales 

Para el desarrollo de este taller, se realizaron el paso a paso del tutorial [Building an Application with Spring Boot](https://spring.io/guides/gs/spring-boot/) y del tutorial [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/).

## Instrucciones de ejecución local
1. Desde cmd clonar el repositorio

```git
https://github.com/Rincon10/IETI-TALLER01.git
```

2. Ubicarse en la carpeta IETI-TALLER01 y borraremos todas las dependencias y modulos que puedan existir de los binarios del proyecto y ademas realizaremos la compilación del proyecto.
```maven
mvn clean install
```

## Definiciones
### Spring-Boot: 
pring Boot es una infraestructura ligera que elimina la mayor parte del trabajo de configurar las aplicaciones basadas en Spring.

## Creando una Aplicación Web Simple

1. Creamos un controlador REST, el cual se encargara de recibir la peticiones web según el PATH que este reciba, [Revisar](https://github.com/Rincon10/IETI-TALLER01/blob/master/src/main/java/edu/eci/ieti/app/webapp/controllers/HelloAPIController.java).

* Ejecutamos el proyecto
```maven
mvn spring-boot:run
```

Al ingresar la siguiente URL, obtendremos la siguiente pantalla y respuesta por parte del controlador.

<img style="height: 450px" src="https://github.com/Rincon10/IETI-TALLER01/blob/master/src/main/resources/static/img/img01.jpg" alt="fst-app">

## Creando una clase de aplicación

1. Modificaremos la clase "principal" para ver los diferentes beans que nos ofrece el contexto, esta clase es la que se encarga de iniciar nuestra app de spring-boot, [Revisar](https://github.com/Rincon10/IETI-TALLER01/blob/master/src/main/java/edu/eci/ieti/app/AppApplication.java).

<img style="height: 450px" src="https://github.com/Rincon10/IETI-TALLER01/blob/master/src/main/resources/static/img/img02.jpg" alt="Main-class">

## Añadiendo pruebas de unidad 

En esta verificaremos que el texto por defecto configurado en nuestro controlador HelloAPIController sea **"Greetings from Spring Boot!"**

<img style="height: 450px" src="https://github.com/Rincon10/IETI-TALLER01/blob/master/src/main/resources/static/img/img03.jpg" alt="test-class">

 
## Ejecutando pruebas

Para la ejecución de pruebas, usaremos el comando.
```maven
mvn test
```

## Nuevo Controlador 

En este caso crearemos un nuevo controlador encargado de recibir peticiones en el path "/greeting", con el fin de mostrar un texto saludando, [revisar](https://github.com/Rincon10/IETI-TALLER01/blob/master/src/main/java/edu/eci/ieti/app/webapp/controllers/GreetingAPIController.java).

Además del controlador se creó una clase que representa un saludo con sus respectivos métodos y atributos, [revisar](https://github.com/Rincon10/IETI-TALLER01/blob/master/src/main/java/edu/eci/ieti/app/webapp/model/Greeting.java).

<img style="height: 450px" src="https://github.com/Rincon10/IETI-TALLER01/blob/master/src/main/resources/static/img/img05.jpg" alt="img-greetings"> <br />

<img style="height: 450px" src="https://github.com/Rincon10/IETI-TALLER01/blob/master/src/main/resources/static/img/img06.jpg" alt="img-greetings-2">

## Autor
[Camilo Rincón](https://github.com/Rincon10)

