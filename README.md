# CRUD-Java-JPA-Registro-Automoviles
Proyecto CRUD con IGU haciendo uso de Java, JPA, Maven, EclipseLink y MySQL.

# Contexto del Proyecto
Una tienda de venta de automóviles necesita de un sistema que le permita realizar un CRUD de todos los vehículos que tiene actualmente a la venta para luego publicarlos en un catálogo. 

Realizar el modelado correspondiente de la clase Automovil teniendo en cuenta los siguientes datos: id, modelo, marca, motor, color, patente(placa), cantidadPuertas. 

Realizar los métodos necesarios para permitir las operaciones CRUD de cada automóvil. 

IMPORTANTE: Respetar el modelo de capas, separando la responsabilidad de cada una de ellas: lógica, interfaz gráfica y persistencia.

# Aplicación Desarrollada

> Al iniciar la aplicacion se muestra la siguiente pantalla de inicio:

![principal](https://github.com/diegoceballosdev/CRUD-Java-JPA-Registro-Automoviles/assets/122060010/71836470-0c97-4112-a0b4-adf148e6ca1c)

> Para realizar la carga de un registro a la base de datos, se debe seleccionar la opcion "Alta de Automoviles", la cual llevará a la siguiente ventana:

![alta](https://github.com/diegoceballosdev/CRUD-Java-JPA-Registro-Automoviles/assets/122060010/4080ad04-2fd8-4175-989f-752b9d7a3dff)

> Aqui se puedrán llenar los campos con los datos corespondientes y se tiene la opcion de guardar estos datos, limpiar los campos de texto o volver a la pantalla anterior.

> Ahora, volviendo a la pantalla de inicio, al seleccionar la opcion "Consulta, Edición y Baja" se muestra la siguiente ventana:

![cons](https://github.com/diegoceballosdev/CRUD-Java-JPA-Registro-Automoviles/assets/122060010/92058931-bbfa-4081-8f27-4f029ffe0cf6)

> En esta ventana puedes visualizar la informacion de cada registro de la base de datos, y tendras la opcion de regresar a la pantalla inicial, "Eliminar" un registro seleccionado o "Editarlo".

> En caso de seleccionar la opcion de "Editar" se abrira la siguiente ventana:

![edit](https://github.com/diegoceballosdev/CRUD-Java-JPA-Registro-Automoviles/assets/122060010/bfb8abe5-4929-411a-bea5-c6532d8952d1)

> Aqui podras nuevamente modificar los datos que desees actualizar o volver a la ventana anterior, ademas de tener la opcion de limpiar  campos de texto y dejarlos vacios.

> Por ultimo, si en la ventana inicial seleccionas la opcion "Salir", la ventana se cerrara y la aplicación finalizara por completo.

He tratado de resumir de forma simple y superficial los apartados de la apliación, sin embargo pueden observar los detalles en el propio codigo. Invito a todos aquellos que estan en su proceso de aprendizaje a implementar este CRUD, clonar este repositorio, leer y jugar con el código. 

Gracias por leer esta pequeña contribución!!!
