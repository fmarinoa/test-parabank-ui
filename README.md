# Proyecto de Automatización con Selenium y Cucumber

Este proyecto implementa la automatización de pruebas para el sitio web Parabank utilizando Selenium WebDriver y
Cucumber con Java. La automatización cubre los casos de uso de registro de usuario y login, validando que el proceso de
registro y la autenticación del usuario funcionan correctamente.

## Índice

- Tecnologías Utilizadas
- Estructura del Proyecto
- Configuración del Proyecto
- Ejecución de Pruebas
- Evidencia de Cucumber
- Contribuciones
- Licencia

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal.
- **Selenium WebDriver**: Herramienta para automatización de navegadores web.
- **Cucumber**: Framework para pruebas de comportamiento BDD (Behavior Driven Development).
- **Faker**: Biblioteca para generación de datos aleatorios.
- **WebDriverManager**: Maneja la configuración del WebDriver.
- **JUnit**: Framework para pruebas en Java.
- **Maven**: Herramienta de gestión de proyectos y dependencias.

## Estructura del Proyecto

El proyecto está estructurado de la siguiente manera:

- **features**/: Contiene los archivos .feature de Cucumber que describen los escenarios de prueba en lenguaje Gherkin.
- **stepsdefinitions**/: Contiene las definiciones de los pasos de Cucumber. Aquí se implementan los métodos que
  corresponden a los pasos definidos en los archivos .feature.
- **page**/: Contiene las clases de página que representan las diferentes páginas del sitio web. Cada clase maneja la
  interacción con elementos en esa página.
- **helper**/: Contiene clases auxiliares y utilitarias, como la clase UserData para manejar datos de usuario.
- **runner**/: Contiene la clase Runner para configurar y ejecutar las pruebas de Cucumber.

## Configuración del Proyecto

1. Clonar el Repositorio

   `git clone https://github.com/francoedson/test-parabank-ui`

   `cd test-parabank-ui`


2. Configurar Maven

   Asegúrate de tener Maven instalado. Puedes verificar la instalación con el siguiente comando:

   `mvn -version`


3. Instalar Dependencias

   Ejecuta el siguiente comando para instalar las dependencias necesarias:

   `mvn clean install`


4. Configurar el WebDriver

   El proyecto utiliza WebDriverManager para manejar la configuración del WebDriver. No se requiere configuración
   adicional
   para el WebDriver.

## Ejecución de Pruebas

Para ejecutar las pruebas automatizadas, puedes utilizar el **Runner** configurado en el proyecto.
Simplemente ejecuta la clase **Runner** desde tu entorno de desarrollo o IDE. Esto ejecutará las pruebas definidas
en los archivos .feature usando Cucumber y Selenium.

Asegúrate de que tu entorno de desarrollo esté configurado correctamente para ejecutar pruebas con **JUnit**.

Las pruebas se ejecutarán utilizando Cucumber y se generarán informes en el directorio target.

## Evidencia de Cucumber

Los resultados de las pruebas se pueden encontrar en los informes generados por Cucumber. Estos informes están ubicados
en el directorio target/cucumber/cucumber-reports.html

## Los informes incluyen:

- Resumen de Ejecución: Información general sobre las pruebas ejecutadas.
- Detalles de Fallos: Información detallada sobre cualquier fallo en las pruebas.
- Capturas de Pantalla: Evidencia visual de los resultados de las pruebas (si se configura).

## Contribuciones

Las contribuciones al proyecto son bienvenidas. Si deseas contribuir, por favor sigue estos pasos:

- Realiza un fork del repositorio.
- Crea una rama para tu característica o corrección.
- Realiza tus cambios y prueba las nuevas funcionalidades.
- Envía un pull request describiendo tus cambios.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.
