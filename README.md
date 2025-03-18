# Practica2SD

## Descripción
Este proyecto es una aplicación de cálculo distribuido utilizando Java RMI (Remote Method Invocation). Permite realizar operaciones matemáticas básicas como suma, resta, multiplicación, división y cálculo de la raíz cuadrada de un número.

## Estructura del Proyecto
- `Servidor.java`: Implementa el servidor RMI que expone los métodos de cálculo.
- `Cliente.java`: Implementa el cliente RMI que consume los métodos de cálculo del servidor.
- `Interfaz.java`: Define la interfaz remota con las firmas de los métodos de cálculo.
- `ServidorTest.java` y `InterfazTest.java`: Contienen pruebas unitarias para los métodos de cálculo.

## Requisitos
- Java Development Kit (JDK) 8 o superior.
- Biblioteca JUnit 5 para pruebas unitarias.

## Configuración
1. Clona el repositorio o descarga los archivos del proyecto.
2. Abre el proyecto en tu IDE favorito (por ejemplo, IntelliJ IDEA, Eclipse).
3. Asegúrate de que el JDK esté configurado correctamente en tu IDE.
4. Compila el proyecto para asegurarte de que no haya errores.

## Ejecución del Servidor
1. Navega al directorio del proyecto.
2. Ejecuta el servidor con el siguiente comando:
   ```sh
   java Servidor
   ```

## Ejecución del Cliente
1. Navega al directorio del proyecto.
2. Ejecuta el cliente con el siguiente comando:
   ```sh
   java Servidor
   ```
3. Ejecuta el cliente con el siguiente comando:
   ```sh
   java Cliente
   ```

## Uso
El cliente te pedirá que elijas una operación matemática y que ingreses los números necesarios para realizar la operación. Los resultados se mostrarán en la consola.

## Pruebas
Para ejecutar las pruebas unitarias, puedes utilizar tu IDE o ejecutar los siguientes comandos desde la línea de comandos:
```sh
java -cp .;path\to\junit-platform-console-standalone-1.12.1.jar org.junit.platform.console.ConsoleLauncher --class-path . --scan-class-path
```

## Autor
- Adrián Brihuega Sánchez

