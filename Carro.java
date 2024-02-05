// Interface Carro
interface Carro {
    void exibirInfo();
}

// Carro Esportivo concreto
class CarroEsportivo implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Carro Esportivo");
    }
}

// Carro Sedan concreto
class CarroSedan implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Carro Sedan");
    }
}

// Interface CarFactory (Abstract Factory)
interface CarFactory {
    Carro criarCarroEsportivo();
    Carro criarCarroSedan();
}

// Fábrica concreta para carros de luxo
class CarroLuxoFactory implements CarFactory {
    @Override
    public Carro criarCarroEsportivo() {
        return new CarroEsportivo();
    }

    @Override
    public Carro criarCarroSedan() {
        return new CarroSedan();
    }
}

// Fábrica concreta para carros populares
class CarroPopularFactory implements CarFactory {
    @Override
    public Carro criarCarroEsportivo() {
        return new CarroEsportivo();
    }

    @Override
    public Carro criarCarroSedan() {
        return new CarroSedan();
    }
}
