# safeTravel
Sistema de Información creado para controlar la información de salud de los pasajeros de una aerolínea a la hora de viajar. 

En el sistema los pasajeros podrán cargar datos como: número de pasaporte, nombre y apellido, número de vuelo (con el cual se puede identificar origen-destino); número de test en el cual incluye datos de salud: temperatura, si tuvo antes covid, resultado de hisopado, si ha sido vacunado o no.

Siendo así el sistema debe realizar las siguientes tareas:

El test realizado, mencionado anteriormente, debe ser de un laboratorio certificado por el aeropuerto, y en caso de ser de alguno diferente, el sistema debe avisar al cliente que el laboratorio ingresado no es válido.

El test debe haberse realizado 72 hs antes del vuelo, en caso de haberse realizado fuera de ese periodo el pasajero no podrá abordar.

Para aquellos pasajeros cuyo test indique el resultado de su PCR como positiva, no pueden abordar.

Al colocar el número de pasaporte en el sistema debe devolver todos los datos del pasajero; incluyendo los datos de su test, origen y destino del vuelo y datos personales.

Tecnologías usadas: Java, Spring Boot, Maven, SQL.


ENGLISH:

Information System created to control the health information from the passengers of an airline when traveling.

In the system, passengers will be able to upload data such as: passport number, name and surname, flight number (with which origin city-destination city can be identified); test number which includes health data: temperature, if you had COVID before, swab result, if you have been vaccinated or not.

This being the case, the system must perform the following tasks:

The COVID test, mentioned above, must be from a laboratory certified by the airport, and if it is from a different one, the system must notify the client that the entered laboratory is not valid.

The test must have been done 72 hours before the flight, if it has been done outside of that period, the passenger will not be able to board.

For those passengers whose test indicates the result of their PCR as positive, they cannot board.

When placing the passport number in the system you must return all the passenger data; including the data of your test, origin and destination of the flight and personal data.

Technologies used: Java, Spring Boot, Maven, SQL.
