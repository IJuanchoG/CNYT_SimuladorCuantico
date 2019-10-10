# CNYT_SimuladorCuantico

Mi nombre es Juan Carlos García y quiero presentarles esta librería que tiene por funcion el calculo de operaciones cuánticas.

esta libreria está implementada en **JAVA** para la materia de **CNYT (Ciencias Naturales y Tecnología)**

## Funciones:
La librería cuenta con varias funciones y versiones de la misma, 

#### Primer versión (Salto de lo clásico a lo cuántico)
Sus principales funciones son:
- Canicas y paso de canicas
- Simulador doble rendija clasico
- Simulador doble rendija cuantico (por corregir)
-También poseemos la implementación de la librería de complejos.

Como ejemplo del código podemos ver esta sección en la que se representa la multiplicación de dos complejos

``` public static Complejo CompMult(Complejo C1, Complejo C2) {
        double pR = C1.getReal()*C2.getReal()-C1.getImg()*C2.getImg(), 
                   pI = C1.getReal()*C2.getImg()+C1.getImg()*C2.getReal();
        return new Complejo(pR,pI);
    }
```
Como podemos notar retorna objetos con las especificaciones obtenidas.

La verificación de los datos se da a partir de las pruebas realizadas, como podemos ver de ejemplo encontramos:
```
/**
     * Test of CompMult method, of class CplxMath.
     */
    @Test
    public void testCompMult() {
        Complejo C1 = new Complejo(-1.5,5);
        Complejo C2 = new Complejo(9,7);
        Complejo expResult = new Complejo(-48.5,34.5);
        Complejo result = CplxMath.CompMult(C1, C2);
        assertEquals(expResult, result);
    }
```


Como ejemplo podemos encontrar este fragmento de código que realiza la suma de dos matrices complejas
```
/**
* Tiene por fin construir el sistema de las canicas
*
*
**/
public Canicas(int[] estI, int[][] ady) throws CanicasException{
        if (estI.length != ady.length) throw new CanicasException(CanicasException.ESTADO_INCOMPATIBLE);
        
        estado0= estI;
        matriz = new int[ady.length][ady.length];
        for(int i = 0; i < ady.length; i++) for(int j: ady[i]) matriz[j-1][i] = 1;
        
    }
```

## Pasos de descarga y uso:

Clona el repositorio con la siguiente dirección en el terminal (cmd) usando el comando:
``` git clone https://github.com/IJuanKhoxD/CNYT_SimuladorCuantico.git```

Abrir el programa descargado con cualquier tipo de IDE Java, es recomendado usar **NetBeans**,
para ejecutar o implementarla debe usar las calculadoras **CplxMath** y **CplxMathS**, siendo cada una dirigida a
numeros complejos y matrices complejas respectivamente.

el tipo de entrada para cada una es:

### CplxMath
```
public static Complejo CompSuma(Complejo C1, Complejo C2 )....
```

donde un complejo tiene este tipo de constructor

```
public Complejo(double r, double j) ....
```

### CplxMathS

```
public static EspacioComp EspacioSum(EspacioComp C1, EspacioComp C2) throws CplxException....
```

donde un matriz compleja tiene este tipo de constructor

```
public EspacioComp(int sizex, int sizey, double[][] datos) ....
```
cabe destacar que este no es su único tipo de constructor


para verificar el correcto funcionamiento de las librerias es recomendable ejecutar las pruebas presentes en estos,
se pueden ejecutar desde el IDE de preferencia o desde comandos MVN tales como 
>>```mvn surefire:test```
