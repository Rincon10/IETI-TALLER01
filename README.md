# IETI-TALLER01 

## Prerrequisitos

-   [Git](https://git-scm.com/downloads) - Version Control System
-   [Maven](https://maven.apache.org/download.cgi) - Dependency Management
-   [Java 8](https://www.java.com/download/ie_manual.jsp) - Development Environment
-   [Spring-Boot](https://spring.io/projects/spring-boot) - Framework Web
-   [Intellij Idea](https://www.jetbrains.com/es-es/idea/download/) (Opcional)

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


<img style="height: 450px" src="" alt="img">

## Añadiendo pruebas de unidad 

En esta verificaremos que el texto por defecto configurado en nuestro cotrolador HelloAPIController sea Greetings from Spring Boot! 
## Ejecutando pruebas

Para la ejecución de pruebas, usaremos el comando.
```maven
mvn test
```

## Autor
[Camilo Rincón](https://github.com/Rincon10)

