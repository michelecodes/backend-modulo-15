public class Main {
    public static void main(String[] args) {
        // Criar uma fábrica de carros de luxo
        CarFactory fabricaLuxo = new CarroLuxoFactory();

        // Criar um carro esportivo de luxo
        Carro carroLuxoEsportivo = fabricaLuxo.criarCarroEsportivo();
        carroLuxoEsportivo.exibirInfo();

        // Criar um carro sedan de luxo
        Carro carroLuxoSedan = fabricaLuxo.criarCarroSedan();
        carroLuxoSedan.exibirInfo();

        // Criar uma fábrica de carros populares
        CarFactory fabricaPopular = new CarroPopularFactory();

        // Criar um carro esportivo popular
        Carro carroPopularEsportivo = fabricaPopular.criarCarroEsportivo();
        carroPopularEsportivo.exibirInfo();

        // Criar um carro sedan popular
        Carro carroPopularSedan = fabricaPopular.criarCarroSedan();
        carroPopularSedan.exibirInfo();
    }
}
