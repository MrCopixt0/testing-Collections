Simulador de Compras en Consola – Java
-
Este proyecto es una aplicación de consola desarrollada en Java como parte de un desafío académico, implementada de forma individual. La idea principal es simular una aplicación de compras donde una persona usuaria puede interactuar con distintas “tiendas”, realizar compras, administrar un saldo y visualizar un historial de gastos ordenado.

El programa se ejecuta completamente en consola y está orientado a reforzar los fundamentos del lenguaje Java, especialmente el control de flujo, el manejo de colecciones y la validación de entradas del usuario.

Funcionalidades principales
-
La aplicación inicia mostrando los datos básicos del usuario y su saldo disponible. A partir de ahí, se presenta un menú principal desde el cual se puede acceder a diferentes tiendas como Xbox, Amazon, Shein y servicios de suscripción. Cada tienda cuenta con su propio submenú y permite realizar múltiples compras antes de regresar al menú principal.

Cada compra descuenta el monto correspondiente del saldo, siempre que exista dinero suficiente. En caso contrario, el sistema informa que no hay saldo disponible. Todas las compras realizadas se almacenan en un historial que se muestra constantemente y se ordena de menor a mayor gasto, lo que permite visualizar fácilmente en qué se ha gastado menos o más dinero.

El programa también contempla validaciones básicas para evitar opciones inválidas y maneja excepciones relacionadas con la entrada de datos, evitando que el usuario ingrese texto cuando se esperan valores numéricos.

Conceptos aplicados
-
En este proyecto se utilizan bucles while para mantener la navegación entre menús, estructuras condicionales para controlar las decisiones del usuario, ArrayList para almacenar dinámicamente el historial de compras y Collections.sort junto con un comparador personalizado para ordenar dicho historial según el monto gastado.

Adicionalmente, el proyecto fue actualizado incorporando manejo de excepciones para controlar errores de entrada. En particular, se implementó una excepción que captura el caso en el que la persona usuaria ingresa texto cuando el programa espera un valor numérico, evitando que la aplicación se rompa y permitiendo mostrar un mensaje de error adecuado antes de continuar la ejecución de forma segura.

Asimismo, se hace uso de Scanner para la lectura de datos desde consola y validaciones lógicas para asegurar un comportamiento coherente del programa, como la verificación de saldo antes de realizar una compra.

Tecnologías utilizadas
-
El proyecto está desarrollado en Java estándar, sin librerías externas, y puede ejecutarse desde cualquier entorno que soporte Java (JDK). No requiere configuración adicional ni dependencias externas.

Objetivo del proyecto
-
El objetivo principal de este desafío fue practicar y consolidar los fundamentos de programación en Java mediante un caso práctico, simulando un sistema realista de interacción por consola. El enfoque estuvo puesto en la lógica, la claridad del flujo del programa y el manejo correcto de datos y decisiones del usuario.

Este proyecto sirve como base para futuras mejoras, como la implementación de clases para representar compras, manejo más avanzado de excepciones o persistencia de datos en archivos.

Autor:
-
- Anderson Collazos - (MrCopixt0)
