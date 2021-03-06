package io.github.brenovit.rainbow.mapper;

import java.util.List;

import io.github.brenovit.rainbow.models.Colaborador;
import io.github.brenovit.rainbow.payload.colaborador.ColaboradorRequest;
import io.github.brenovit.rainbow.payload.colaborador.ColaboradorResponse;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class ColaboradorMapper {
    private static MapperFactory mapperFactory;

    static {
        mapperFactory = new DefaultMapperFactory.Builder().build();
    }

    public static Colaborador parse(ColaboradorRequest request){    	
        return mapperFactory.getMapperFacade().map(request, Colaborador.class);
    }
  
    public static ColaboradorResponse parse(Colaborador request){
        return mapperFactory.getMapperFacade().map(request, ColaboradorResponse.class);
    }
    
	public static List<ColaboradorResponse> parse(List<Colaborador> request) {
		return mapperFactory.getMapperFacade().mapAsList(request, ColaboradorResponse.class);
	}

}
