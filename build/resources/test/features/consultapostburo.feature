Feature: Como usuario deseo consultar datacredito
 @Datacredito
  Scenario: Consultar datacredito
    Given Yo cargo la informacion de mi usuario:
        |X-CustIdentType|X-CustIdentNum|
        |CC             |1000320221    |
    When Envio la peticion GetDataCredit
    Then Recibo una respuesta con el datacredito con codigo 200


   @Getkey
   Scenario: Como usuario deseo conocer las ciudades disponibles
     Given Yo como usuario envio los datos
       |Id       |
       |05001001 |
     When Envio la peticion Get
     Then Recibo el siguiente status code 200
