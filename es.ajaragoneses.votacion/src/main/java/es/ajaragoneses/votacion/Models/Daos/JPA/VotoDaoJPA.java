package es.ajaragoneses.votacion.Models.Daos.JPA;

import es.ajaragoneses.votacion.Models.Daos.VotoDao;
import es.ajaragoneses.votacion.Models.Entities.Voto;

public class VotoDaoJPA extends GenericDaoJPA<Voto, Integer> implements VotoDao {

	public VotoDaoJPA() {
		super(Voto.class);
	}
}
