package ldc1.tpprogramacionjpa.logica;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.Date;
import javax.annotation.processing.Generated;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-13T11:51:30", comments="EclipseLink-3.0.2.v20210716-re8d4b571c9")
@StaticMetamodel(Paciente.class)
public class Paciente_ extends Persona_ {

    public static volatile SingularAttribute<Paciente, Integer> codigo;
    public static volatile SingularAttribute<Paciente, Date> fechaDeInternacion;

}