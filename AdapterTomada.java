
public class AdapterTomada implements TomadaJaponesa {
	TomadaBrasileira tomada;

	public AdapterTomada() {
		tomada = new TomadaBrasileira();

	}

	@Override
	public void conectar() {
		tomada.conectar();

	}

}
