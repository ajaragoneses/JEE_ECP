package es.ajaragoneses.votacion.Models.Daos.JPA;

import es.ajaragoneses.votacion.Models.Daos.TemaDao;
import es.ajaragoneses.votacion.Models.Entities.Tema;

public class TemaDaoJPA extends GenericDaoJPA<Tema, Integer> implements TemaDao {

	public TemaDaoJPA() {
		super(Tema.class);
	}
}
