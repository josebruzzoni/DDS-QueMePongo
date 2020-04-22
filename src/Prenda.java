import static java.util.Objects.requireNonNull;

class Prenda {
	TipoDePrenda tipoDePrenda;
	Material material;
	Color colorPrimario;
	Color colorSecundario;

	public Prenda(TipoDePrenda tipoDePrenda, Material material, Color colorPrimario) {
		this.tipoDePrenda = requireNonNull(tipoDePrenda,"Es obligatorio el tipo de prenda");
		this.material = requireNonNull(material,"Es obligatorio el material");
		this.colorPrimario = requireNonNull(colorPrimario,"Es obligatorio el ccolor primario");
	}
    public Prenda(TipoDePrenda tipo, Material material, Color colorPrimario, Color colorSecundario) {
        this(tipo, material, colorPrimario);
        this.colorSecundario = colorSecundario;
    }
	Categoria categoria() {
		return tipoDePrenda.categoria();
	}
}

//ejemplo
//Prenda miRemeraAmarilla = new Prenda(
//		  TipoDePenda.REMERA, 
//		  Material.ALGODON, 
//		  Color.AMARILLO_TIRANDO_A_CREMITA)

