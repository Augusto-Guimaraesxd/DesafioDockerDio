import java.util.Scanner;

public class IdadePlanetaria {
    // Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double idadeTerrestre = scanner.nextDouble();
            String planeta = scanner.next();
            final double marte = 1.88;
            final double venus = 0.62;
            final double jupiter = 11.86;

            switch (planeta) {
                case "Marte": {

                    double calc = idadeTerrestre / marte;
                    System.out.format("Idade equivalente em Marte: %.2f anos", calc);
                    break;
                }
                case "Venus": {

                    double calc = idadeTerrestre / venus;
                    System.out.format("Idade equivalente em Venus: %.2f anos" , calc);
                    break;
                }
                case "Jupiter": {

                    double calc = idadeTerrestre / jupiter;
                    System.out.format("Idade equivalente em Jupiter: %.2f anos" , calc);
                    break;
                }
                default:
                    System.out.println("Planeta invalido.");
                    break;
            }

            //TODO: Crie as condições para calcular a idade equivalente de cada planeta.

            //TODO: Imprima a saída conforme descrito neste desafio.

            scanner.close();
        }
    }
