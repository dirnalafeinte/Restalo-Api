package ca.ulaval.glo2003.api.exceptionMapping;

import ca.ulaval.glo2003.domain.InvalidParameterException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;

public class InvalidParamExceptionMapper implements ExceptionMapper<InvalidParameterException> {

    @Override
    public Response toResponse(InvalidParameterException exception){
        exception.printStackTrace();
        return Response.status(400).entity(new ErrorResponse(ErrorCode.INVALID_PARAMETER, exception.getMessage())).build();
    }
}
