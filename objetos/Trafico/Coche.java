package objetos.Trafico;

public class Coche {

    // PROPIEDADES
    private String matricula;
    private double maxLitrosDeposito;
    private double maxLitrosReserva;
    private double velocidadMaxima;
    private double consumoMedio100km;
    private Persona propietario;

    // ESTADOS
    private boolean motorArrancado;
    private boolean estaEnReserva;
    private double numLitrosActual;
    private double velocidadActual;
    private double kilometraje;

    // CONSTRUCTOR
    public Coche(String mat, double maxDeposito, double consumoMedio, double velMax) {
        matricula = mat;
        if (maxDeposito <= 0) {
            maxLitrosDeposito = 50;
        } else {
            maxLitrosDeposito = maxDeposito;
        }
        if (consumoMedio <= 0) {
            consumoMedio = 7.5;
        } else {
            consumoMedio100km = consumoMedio;
        }
        if (velMax <= 0) {
            velocidadMaxima = 180;
        } else {
            velocidadMaxima = velMax;
        }
    }

    // GETTERS Y SETTERS

    public void imprimirDatos() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Max Deposito: " + maxLitrosDeposito);
        System.out.println("Consumo medio 100km: " + consumoMedio100km);
        System.out.println("Velocidad Max: " + velocidadMaxima);
    }

    public void setMatricula(String nuevaMat) {
        matricula = nuevaMat;
        System.out.println("Nueva matricula: " + nuevaMat);
    }

    public void setPropietario(Persona p) {
        propietario = p;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getMaxLitrosDeposito() {
        return maxLitrosDeposito;
    }

    public double getMaxLitrosReserva() {
        maxLitrosReserva = (maxLitrosDeposito * 15) / 100;
        return maxLitrosReserva;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public double getConsumoMedio100km() {
        return consumoMedio100km;
    }

    public boolean getMotorArrancado() {
        return motorArrancado;
    }

    public boolean getEstaEnReserva() {
        return estaEnReserva;
    }

    public double getNumLitrosActual() {
        return numLitrosActual;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public boolean poseePropietario() {
        if (propietario == null) {
            return false;
        } else {
            return propietario.poseeCoche();
        }
    }

    // COMPORTAMIENTOS
    public void arrancarMotor() {
        if (numLitrosActual <= 0) {
            System.out.println("No hay combustible, no se puede arrancar");
        } else if (motorArrancado) {
            System.out.println("El motor ya esta arrancado");
            if (estaEnReserva) {
                System.out.println("El coche esta en reserva");
            }
        } else {
            motorArrancado = true;
            System.out.println("Coche con " + matricula + " matricula");
            System.out.println("Motor Arrancado");
            if (estaEnReserva) {
                System.out.println("El coche esta en reserva");
            }
        }
    }

    public void pararMotor() {
        if (motorArrancado) {
            motorArrancado = false;
            System.out.println("Coche con " + matricula + " matricula");
            System.out.println("Motor Parado");
        }
    }

    public void repostar(double litros) {
        if (litros >= 0) {
            if (maxLitrosDeposito >= numLitrosActual + litros) {
                numLitrosActual += litros;
                if (maxLitrosReserva < numLitrosActual) {
                    estaEnReserva = false;
                }
                System.out.println("Coche con " + matricula + " matricula");
                System.out.println(
                        "Deposito repostado con " + litros + "L su deposito actual es de " + numLitrosActual + "L");
            } else if (maxLitrosDeposito <= numLitrosActual + litros) {
                numLitrosActual = maxLitrosDeposito;
                System.out.println("Coche con " + matricula + " matricula tiene " + numLitrosActual + "L");
                System.out.println(litros + "L no caben en su deposito y ha rebosado");
            }
        } else {
            System.out.println("Coche con " + matricula + " matricula tiene " + numLitrosActual + "L");
        }
    }

    public void fijarVelocidad(double velocidad) {
        if (!motorArrancado) {
            System.out.println("Coche con " + matricula + " matricula");
            System.out.println("El motor esta apagado");
        } else {
            if (velocidad < 0) {
                velocidadActual = 0;
                System.out.println("Coche con " + matricula + " matricula");
                System.out.println("Se ha fijado la velocidad a " + velocidadActual);
            } else if (velocidad > velocidadMaxima) {
                velocidadActual = velocidadMaxima;
                System.out.println("Coche con " + matricula + " matricula");
                System.out.println("Se ha fijado la velocidad a " + velocidadActual);
            } else {
                velocidadActual = velocidad;
                System.out.println("Coche con " + matricula + " matricula");
                System.out.println("Se ha fijado la velocidad a " + velocidadActual);
            }
        }
    }

    public void recorrerDistancia(double kilometros) {
        if (!motorArrancado) {
            System.out.println("Coche con " + matricula + " matricula");
            System.out.println("El motor esta apagado");
        } else {
            if (velocidadActual == 0) {
                System.out.println("No puedes recorrer una distancia con velocidad 0");
            } else if (kilometros <= 0) {
                System.out.println("No puedes recorrer " + kilometros + " km");
            } else {
                double litrosconsumidos = consumoMedio100km * (1 + (velocidadActual - 100) / 100);
                double litrosNecesarios = kilometros * litrosconsumidos / 100;
                double distanciaReal = 100 * numLitrosActual / litrosconsumidos;
                if (numLitrosActual - litrosconsumidos == 0) {
                    kilometraje += kilometros;
                    numLitrosActual -= litrosconsumidos;
                    if (litrosconsumidos <= numLitrosActual) {
                        estaEnReserva = true;
                    }
                    motorArrancado = false;
                    System.out.println("Distancia recorrida pero ya no hay combustible");

                } else if (numLitrosActual < litrosNecesarios) {
                    System.out.println("No hay combustible para reccorrer la distancia");
                    System.out.println("Necesitas " + litrosNecesarios + "L para recorrer la distancia y tienes "
                            + numLitrosActual);
                    System.out.println(
                            "Te has quedado en el kilometro " + distanciaReal + " y te has quedados sin combustible");
                    numLitrosActual = 0;
                    kilometraje += distanciaReal;
                    estaEnReserva = true;
                    motorArrancado = false;
                } else {
                    kilometraje += kilometros;
                    numLitrosActual -= litrosconsumidos;
                    if (litrosconsumidos <= numLitrosActual) {
                        estaEnReserva = true;
                    }
                    System.out.println("Distancia recorrida");
                }
            }
        }
    }
}