# safeTravel
Sistema de Información creado para controlar la información de salud de los pasajeros de una aerolínea a la hora de viajar. 

En el sistema los pasajeros podrán cargar datos como: número de pasaporte, nombre y apellido, número de vuelo (con el cual se puede identificar origen-destino); número de test en el cual incluye datos de salud: temperatura, si tuvo antes covid, resultado de hisopado, si ha sido vacunado o no.

Siendo así el sistema debe realizar las siguientes tareas:

El test realizado, mencionado anteriormente, debe ser de un laboratorio certificado por el aeropuerto, y en caso de ser de alguno diferente, el sistema debe avisar al cliente que el laboratorio ingresado no es válido.

El test debe haberse realizado 72 hs antes del vuelo, en caso de haberse realizado fuera de ese periodo el pasajero no podrá abordar.

Para aquellos pasajeros cuyo test indique el resultado de su PCR como positiva, no pueden abordar.

Al colocar el número de pasaporte en el sistema debe devolver todos los datos del pasajero; incluyendo los datos de su test, origen y destino del vuelo y datos personales.

Tecnologías usadas: Java, Spring Boot, Maven.

