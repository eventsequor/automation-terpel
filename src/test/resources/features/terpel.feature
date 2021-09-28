#language:es
#Author: eder.carbonero@sophossolutions.com
@smoke
Característica: Prueba de concepto

  @successful
  Escenario: Este es un escenario de muestra
    Dado La aplicación de terpel y el usuario "cliente"
    Cuando El usuario va la pestaña de quienes somos
    Entonces valida que la misión contenga "En el 2025"
	
  @mistakevision
  Escenario: Este es un escenario de muestra con fallo
    Dado La aplicación de terpel y el usuario "cliente"
    Cuando El usuario va la pestaña de quienes somos
    Entonces valida que la misión contenga "En el 2024"

