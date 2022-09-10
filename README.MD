# Universidad Nacional de La Matanza Departamento de Ingeniería e Investigaciones Tecnológicas
## Tecnicatura Universitaria en Desarrollo de Aplicaciones para Dispositivos Móviles
### Programación Móvil 1
#### TP “Cadena de estacionamientos”
##### Profesores:
 - Pardo,Sebastian
 -  Bayarri,Brian
 - Hoz,Aylen
 - Gonzalez,Diego
 - Uran, Jonatan

##### Descripción:
La cadena de estacionamientos **“Parking del Oeste”** quiere implementar un sistema de gestión de parking de clientes. En esta primera versión del sistema solo se debe registrar los pagos de ticket de estacionamiento.
La tarifa base por hora es de $150, a la cual se le aplica un recargo dependiendo el caso.
La cadena opera con 3 categorías de vehículo, donde cada una tiene sus propias reglas de negocio de parking:


| **VEHICULO**    | **RECARGO**                                                                                                                                                                                                           | **EJEMPLO**                                                                                                                                                                                                                                                                                 |
|-----------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Automóvil       | Si el ingreso al estacionamiento ocurre entre las 9:00hs y las 11:30hs (hora pico diurna) o entre las 18hs y 20hs (hora pico nocturna), aplica un recargo por hora del 5%; sino aplica un recargo por hora del 3%   	 | <ul><li> Si el cliente estaciono a las 9:15hs, el monto del ticket será de $157,50 por hora</li><li>Si el cliente estaciono a las 15:30hs, el monto del ticket será de $154,50 por hora</li><li>Si el cliente estaciono a las 19:00hs, el monto del ticket es de $157,50 por hora</li></ul> |
| Vehículo pesado | Si el paso por peaje ocurre un sábado o domingo, aplica un recargo por hora del 10%; sino aplica un recargo por hora del 5%                                                                                           | <ul><li>Si el cliente estaciono un día sábado o domingo, el monto del ticket será de $165 por hora</li><li>Si el cliente estaciono un día de semana, el monto del ticket será de $157,50 por hora</li></ul>                                                                                 |
| Ciclomotor      | No se le aplica recargos                                                                                                                                                                                              | <ul><li>Siempre el monto del ticket será de $150 por hora</li></ul>                                                                                                                                                                                                                         |


A su vez, como estrategia para atraer clientes, la empresa otorga los siguientes beneficios:

| **BENEFICIO**                                                                                                                                             | **EJEMPLO**                                                                                                                                                        |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Si el cliente tiene 1 mes o menos de antigüedad, se le aplica un descuento del 50% al ticket de estacionamiento (total con recargo)                       | Si un cliente de 20 días de antigüedad estaciono su camión por 6hs un día sábado, siendo la tarifa por hora aplicada en su caso de $165; el ticket será de $495    |
| Si el cliente tiene más de 1 mes, pero 6 meses o menos de antigüedad, se le aplica un descuento del 25% al ticket de estacionamiento (total con recargos) | Si un cliente de 5 meses de antigüedad estaciono su camión por 6hs un día sábado, siendo la tarifa por hora aplicada en su caso de $165; el ticket será de $742,50 |
| Si el cliente tiene más de 6 meses de antigüedad, no se le aplica ningún descuento                                                                        | Si un cliente de 8 meses de antigüedad estaciono su camión por 6hs un día sábado, siendo la tarifa por hora aplicada en su caso de $165; el ticket será de $990    |

##### Consigna
El objetivo de usted como desarrollador es permitirle al cliente pagar sus tickets teniendo en cuenta lo siguiente:

-  Calcular correctamente el monto a pagar aplicando los recargos y descuentos según corresponda
-  Validar si el saldo en la cuenta del cliente es suficiente para abonar el ticket
-  Implementar un login mediante nombre de usuario y password

Por otro lado, y como ultima funcionalidad, el cliente tiene que ser capaz de ver su historial de cobros de ticket de estacionamiento.
Los datos de un cliente se almacenan de la siguiente forma:

```json
{
  "nombre_de_usuario": String,
  "password": String,
  "nombre": String,
  "apellido": String,
  "saldo_en_cuenta": Double,
  "fecha_de_alta": String (formato "yyyy-MM-dd")
}
```

Los datos de un cobro de ticket se almacenan de la siguiente forma:

```json
{
  "codigo_ticket": Int,
  "fecha_de_ingreso": String (formato "yyyy-MM-dd"), 
  "hora_de_ingreso": String (formato "hh:mm"),
  "vehiculo": String,
  "estadia": Int (horas de estadia),
  "monto_bruto": Double (con recargo y sin descuento, en pesos), 
  "monto_final": Double (con recargo y descuento, en pesos)
}
```

Notas:

- No necesita implementar una interfaz gráfica para este ejercicio.
- No necesita hacer uso de una base de datos para este ejercicio.
- Todas las reglas que la compañía usa para calcular el costo total fueron dadas
  anteriormente. No necesita aplicar ninguna otra regla.
  
Requisitos:
- Hacer uso de dos tipos diferentes de clases.
- Hacer uso de herencia y polimorfismo.
- Hacer uso de funciones lambda y/o funciones acotadas.
- Crear y hacer uso de al menos dos excepciones.
- Construir un menú estático que le permita a un cliente elegir la operación a realizar
  operar.
