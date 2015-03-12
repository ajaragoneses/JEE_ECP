package es.ajaragoneses.votacion.Models.Daos.JPA;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;

import es.ajaragoneses.votacion.Models.Daos.DaoFactory;
import es.ajaragoneses.votacion.Models.Daos.TemaDao;
import es.ajaragoneses.votacion.Models.Daos.VotoDao;

public class DaoJPAFactory extends DaoFactory{
    private static final String PERSISTENCE_UNIT = "SistemaVotacion";

    private static EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory(PERSISTENCE_UNIT);

    public DaoJPAFactory() {
        LogManager.getLogger(DaoJPAFactory.class).debug("create Entity Manager Factory");
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

	@Override
	public TemaDao getTemaDao() {
		return new TemaDaoJPA();
	}

	@Override
	public VotoDao getVotoDao() {
		return new VotoDaoJPA();
	}

}